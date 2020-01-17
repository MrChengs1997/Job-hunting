<template>
  <div id="container">
    <leftcontainer/>
    <div class="content">
      <div id="search_box">
        <form id="searchForm" name="" >
          <ul id="searchType">
            <li data-searchtype="1" class="type_selected">职位</li>
            <li data-searchtype="4">公司</li>
          </ul>
          <div class="searchtype_arrow"></div>
          <input type="text" id="search_input" v-model="serachName"  placeholder="请输入职位名称，如：产品经理"  />
          <input type="submit" @click.prevent="serachButtonByName" id="search_button" value="搜索" />
        </form>
      </div>
      <dl class="hotSearch">
        <dt>热门搜索：</dt>
        <dd><a href="list.htmlJava?labelWords=label&city=">Java</a></dd>
        <dd><a href="list.htmlPHP?labelWords=label&city=">PHP</a></dd>
        <dd><a href="list.htmlAndroid?labelWords=label&city=">Android</a></dd>
        <dd><a href="list.htmliOS?labelWords=label&city=">iOS</a></dd>
        <dd><a href="list.html前端?labelWords=label&city=">前端</a></dd>
        <dd><a href="list.html产品经理?labelWords=label&city=">产品经理</a></dd>
        <dd><a href="list.htmlUI?labelWords=label&city=">UI</a></dd>
        <dd><a href="list.html运营?labelWords=label&city=">运营</a></dd>
        <dd><a href="list.htmlBD?labelWords=label&city=">BD</a></dd>
        <dd><a href="list.html?gx=实习&city=">实习</a></dd>
      </dl>
      <ul class="reset hotabbing">
        <li @click="serHotJobDetails"><a>热门职位</a></li>
        <li><a @click="serNewJobDetails">最新职位</a></li>
      </ul>
      <div id="hotList">
        <ul class="reset my_jobs">
          <li data-id="149594" v-for="(serachJobDetail,index) in serachJobDetails" :key="index"  >
            <h3>
              <a >{{serachJobDetail.jobName}}</a>
              <span>[{{serachJobDetail.jobCity}}]</span>
            </h3>
            <span class="receivedResumeNo">工作列表（{{index}}）</span>
            <div>部门： {{serachJobDetail.jobDept}}</div>
            <div>职位名称： {{serachJobDetail.jobName}}</div>
            <div>工作类别： {{serachJobDetail.jobCategory}}</div>
            <div>职位性质： {{serachJobDetail.jobNature}}</div>
            <div>薪资区间： {{serachJobDetail.jobSalaryMin}}k-{{serachJobDetail.jobSalaryMax}}k</div>
            <div>工作经验： {{serachJobDetail.jobExper}}</div>
            <div>学历要求： {{serachJobDetail.jobEduc}}</div>
            <div>工作地点： {{serachJobDetail.jobAddress}}</div>
            <div>工作描述： {{serachJobDetail.jobDesc}}</div>
            <div class="c9" >发布时间： {{serachJobDetail.jobCreateDate}}</div>
            <div style="text-align:center" class="btn_sended" ><a @click.prevent="delivery(serachJobDetail.jobId)">投递</a></div>
            <div class="links">
            </div>
          </li>
          <a href="list.html" class="btn fr" target="_blank">查看更多</a>
        </ul>
      </div>
      <linkItem/>
    </div>
  </div>
</template>
<script>
  import leftcontainer from './container/leftcontainer'
  import linkItem from  './container/linkItem'
  import axios from 'axios'
  import strogUtil from '../util/strogUtil'
  export default {
    data(){
      return{
        serachJobDetails:[],//查询之后 存数据的数组
        serachName:'',//根据serachname进行搜索工作
      }
    },
    methods:{
      //查询最新的数据20条
      serNewJobDetails(){
        this.serachJobDetails = []
        const  url = `http://127.0.0.1:8082/getNewJobDetail`;
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          this.serachJobDetails = code
          console.log(this.serachJobDetails)
          })
        },
      //根据输入的jobName进行查询
      serHotJobDetails(){
        this.serachJobDetails = []
        const  url = `http://127.0.0.1:8082/getHotJobDetail`;
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          this.serachJobDetails = code
          console.log(this.serachJobDetails)
        })
      },
      //根据搜索的内容进行搜索
      serachButtonByName(){
        const  name = this.serachName;
        this.serachJobDetails = []
        const  url = `http://127.0.0.1:8082/getJobDetailByName/${name}`;
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          this.serachJobDetails = code
          console.log(this.serachJobDetails)
        })
      },
      //投简历按钮
      delivery(job_id){//job_id:获取job表的id
        const  userId = strogUtil.readToken().userId
        const jobId = job_id
        const  url = `http://127.0.0.1:8082/vueISdelivery/${userId}/${jobId}`;

        axios({
          url:url,
          method:'POST',
        }).then(response => {
         // 0：已经投递过的公司（）    1：表示没有投递过（）
          const  code = response.data
          if (code ==0){
            alert("您已经投递过该公司的该职位！")
            return;
          }
          if (code ==1){
                      //进行投递岗位
                      const  url1 = `http://127.0.0.1:8082/vuedelivery/${userId}/${jobId}`;
                      axios({
                        url:url1,
                        method:'POST',
                      }).then(response => {
                        //0：已经投递过的公司（投递失败）    1：表示没有投递过（投递成功）
                        const  code = response.data
                        if (code ==1){
                          alert("投递成功！")
                        }
                        return
                      })
          }
          return
        })



      }

    },
    components:{
      leftcontainer,linkItem
    },
    mounted () {//模仿ajax实时掉接口进行数据的显示

        this.serachJobDetails = []
        const  url = `http://127.0.0.1:8082/getHotJobDetail`;
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          this.serachJobDetails = code
          console.log(this.serachJobDetails)
        })

    },
  }
</script>
<style>
  .ui-autocomplete{width:488px;background:#fafafa !important;position: relative;z-index:10;border: 2px solid #91cebe;}
  .ui-autocomplete-category{font-size:16px;color:#999;width:50px;position: absolute;z-index:11; right: 0px;/*top: 6px; */text-align:center;border-top: 1px dashed #e5e5e5;padding:5px 0;}
  .ui-menu-item{ *width:439px;vertical-align: middle;position: relative;margin: 0px;margin-right: 50px !important;background:#fff;border-right: 1px dashed #ededed;}
  .ui-menu-item a{display:block;overflow:hidden;}
</style>

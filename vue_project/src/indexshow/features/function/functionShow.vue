<template>

  <div id="container">

    <div class="sidebar">
      <a class="btn_create" @click="updateshowJobCode(0)">发布新职位</a>
      <dl class="company_center_aside">
        <dt>我收到的简历</dt>
        <dd>
          <a  @click="updateshowJobCode(1)">待处理简历</a>
        </dd>
        <dd>
          <a  @click="updateshowJobCode(1,1)">已通知面试简历</a>
        </dd>
        <dd>
          <a  @click="updateshowJobCode(3)">不合适简历</a>
        </dd>

      </dl>
      <dl class="company_center_aside">
        <dt>我发布的职位</dt>
        <dd>
          <a  @click="updateshowJobCode(4,0)">有效职位</a>
        </dd>
        <dd>
          <a  @click="updateshowJobCode(4,1)">已下线职位</a>
        </dd>
      </dl>
      <div class="subscribe_side mt20">
        <div class="f14">想收到更多更好的简历？</div>
        <div class="f18 mb10">就用拉勾招聘加速助手 </div>
        <div>咨询：<a class="f16" href="mailto:jessica@lagou.com">jessica@lagou.com</a></div>
        <div class="f18 ti2em">010-57286512</div>
      </div>
      <div class="subscribe_side mt20">
        <div class="f14">加入互联网HR交流群</div>
        <div class="f18 mb10">跟同行聊聊</div>
        <div class="f24">338167634</div>
      </div>            </div><!-- end .sidebar -->
    <!--内容区域-->
    <div class="content">
      <!--创建招聘职位页面-->
      <div v-show="showJobCode == 0">
                <createjob/>
      </div>
      <!-- 待处理简历&已通知面试简历  1/2-->
      <div v-show="showJobCode == 1" >
         <handleResume :showdiffjobCode="showdiffjobCode"/>
      </div>
      <!--不合适简历-->
      <div v-show="showJobCode == 3">
        <refuseResume/>
      </div>
      <!--effectiveJob&下线职位  4/5-->
      <div v-show="showJobCode == 4">
        <effective-job :deleteJobDetails="deleteJobDetails"
                       :jobDetails="jobDetails"  :showdiffjobCode="showdiffjobCode"/>
      </div>
    </div>

  </div>
</template>
<script>
  //创建招聘职位页面
  import createjob from './item/createjob'

  //待处理简历&已通知面试简历
  import handleResume from './item/handleResume'

  //不合适简历
  import refuseResume from './item/refuseResume'

  //有效职位&下线职位
  import effectiveJob from './item/effectiveJob'
  import strogUtil from '../../../util/strogUtil'
  import axios from 'axios'

  export default {
    data(){
      return{
        showJobCode:'1',//展示工区去页面（发布职位0，待处理简历1，已通知面试简历2，不合适简历3，有效职位4，下线5）
        showdiffjobCode :1,//组件进行显示的另一个组件
        jobDetails:[],

      }
    },
    methods:{
      //删除jobDetails数组的数据（根据索引）
      deleteJobDetails(index){
        this.jobDetails.splice(index,1);
      },
      //点击事件触发之后进行跳转到指定的页面
      updateshowJobCode(id,num){
        this.showJobCode = id;

        this.jobDetails = []

        //有效职位&已下线职位的判断
        if (this.showJobCode == 4){
          const userId = strogUtil.readToken().userId
          if(num == 0){//有效职位页面
            this.showdiffjobCode = 1;
            const  url = `http://127.0.0.1:8082/vuegetjobdetail/${userId}/1`;
            axios({
              url:url,
              method:'GET',
            }).then(response => {
              const  code = response.data
              this.jobDetails = response.data
              this.jobDetails.forEach(function (item,index) {
              })
            })
            return;
          }else  if (num ==1){//下线职位页面
            this.showdiffjobCode = 0;
            const  url = `http://127.0.0.1:8082/vuegetjobdetail/${userId}/0`;
            axios({
              url:url,
              method:'GET',
            }).then(response => {
              const  code = response.data
              this.jobDetails = response.data
            })
            return;
          }
        }


        //待处理简历&已通知面试简历


      }
    },
    components :{
      createjob,handleResume,refuseResume,effectiveJob
    },
  }
</script>

<style>

</style>

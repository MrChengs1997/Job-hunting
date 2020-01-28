<template>
    <div>
      <dl class="company_center_content">
        <dt>
          <h1 v-if="showdiffjobCode == 0">
            <em></em>
            待定简历
          </h1>
          <h1 v-if="showdiffjobCode == 1">
            <em></em>
            已通知面试简历
          </h1>
        </dt>
        <dd>
          <form  method="get" id="filterForm">
            <ul class="reset resumeLists">
            <li v-for="(resumeShowDeail,index) in resumeShowDeails " :key="index" data-id="1686182" class="onlineResume">
              <div class="resumeShow">
                <ul class="reset my_jobs">
                  <li data-id="149594"  >
                    <h3>
                      <a >{{resumeShowDeail.jobName}}</a>
                      <span>[{{resumeShowDeail.jobCategory}}]</span>
                    </h3>
                    <span class="receivedResumeNo">投递时间： {{resumeShowDeail.deliveryDate}}</span>
                    <div>学历要求：{{resumeShowDeail.jobEduc}} </div>
                    <div>工作性质：{{resumeShowDeail.jobNature}} </div>
                    <div>薪资区间：{{resumeShowDeail.jobSalaryMin}}k - {{resumeShowDeail.jobSalaryMax}}k </div>
                    <br>
                    <h3>
                      <span>简历信息</span>
                    </h3>
                    <div>简历姓名：{{resumeShowDeail.resumeName}} </div>
                    <div>简历性别：{{resumeShowDeail.resumeSex}} </div>
                    <div>联系方式：{{resumeShowDeail.resumePhone}} </div>
                    <div>简历学历：{{resumeShowDeail.resumeEduc}} </div>
                    <div>工作年限：{{resumeShowDeail.resumeWorkYear}} </div>
                    <div>简历期望工作：{{resumeShowDeail.resumeExpectWork}} </div>
                    <div>工作经历：{{resumeShowDeail.resumeWorkExper}} </div>
                    <div>项目经验：{{resumeShowDeail.resumeProjectExper}} </div>
                    <div>作品地址：{{resumeShowDeail.resumeWorksAddr}} </div>
                    <div>自我描述：{{resumeShowDeail.resumeDesc}} </div>
                    <div v-if="showdiffjobCode == 0" style="text-align:center" class="btn_sended" >
                              <a @click="qualified(resumeShowDeail.resumeUserId,resumeShowDeail.jobId,index)">合格</a>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              <a  @click="disqualified(resumeShowDeail.resumeUserId,resumeShowDeail.jobId,index)">不合格</a></div>
                    <div v-if="showdiffjobCode == 1" style="text-align:center" class="btn_sended" >
                        <a @click="deleteResume(resumeShowDeail.resumeUserId,resumeShowDeail.jobId,index)">删除记录</a></div>
                    <div class="links">
                    </div>
                  </li>
                </ul>
                </div>
            </li>
          </ul><!-- end .resumeLists -->
          </form>
        </dd>
      </dl>
    </div>
</template>
<script>
  import axios from 'axios'
  export default {
    props:{
      showdiffjobCode:Number,
      resumeShowDeails:Array,//查询简历详情
      updateResumeShowDeails:Function
    },
    data(){
      return {
      }
    },
    methods:{
      //合格用户简历
      qualified(userId,jobId,index){//投递简历用户：userId   投递工作的id:jobId
        console.log(userId + "--" + jobId + "--" + index)
        const url = `http://localhost:8082/vuequalifiedResume/${userId}/${jobId}`
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          if (code ==1){
            this.updateResumeShowDeails(index)
          }
          return
        })
        return
      },
      //不合格用户简历
      disqualified(userId,jobId,index){
        console.log(userId + "--" + jobId + "--" + index)
        const url = `http://localhost:8082/vuedisqualifiedResume/${userId}/${jobId}`
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          if (code ==1){
            this.updateResumeShowDeails(index)
          }
          return
        })
        return
      },
      //删除合格简历记录
      deleteResume(userId,jobId,index){
        console.log(userId + "--" + jobId + "--" + index)
        const url = `http://localhost:8082/vuedeleteResume/${userId}/${jobId}`
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          if (code ==1){
            this.updateResumeShowDeails(index)
          }
          return
        })
        return
      }

    }
  }
</script>

<style>

</style>

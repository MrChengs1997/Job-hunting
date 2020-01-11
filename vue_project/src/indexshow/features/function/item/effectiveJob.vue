<template>
    <div>
      <dl class="company_center_content">
        <dt>
              <h1 v-if="showdiffjobCode ==1">
                <em></em>
                有效职位
              </h1>
              <h1 v-if="showdiffjobCode == 0">
                <em></em>
                已下线职位
              </h1>
        </dt>
        <dd>
          <form id="searchForm">
            <input type="hidden" value="Publish" name="type">
            <ul class="reset my_jobs">
              <li data-id="149594" v-for="(jobDetail,index) in jobDetails" :key="index"  >
                <h3>
                  <a target="_blank"  href="http://www.lagou.com/jobs/149594.html">{{jobDetail.jobName}}</a>
                  <span>[{{jobDetail.jobCity}}]</span>
                </h3>
                <span class="receivedResumeNo">应聘简历（{{index}}）</span>
                <div>{{jobDetail.jobNature}} / {{jobDetail.jobSalaryMin}}k-{{jobDetail.jobSalaryMax}}k /  {{jobDetail.jobExper}} / {{jobDetail.jobEduc}}</div>
                <div>部门： {{jobDetail.jobDept}}</div>
                <div>工作地点： {{jobDetail.jobAddress}}</div>
                <div>工作描述： {{jobDetail.jobDesc}}</div>
                <div class="c9" v-if="showdiffjobCode ==1">发布时间： {{jobDetail.jobCreateDate}}</div>
                <div class="c9" v-if="showdiffjobCode ==0">下线时间： {{jobDetail.jobEndDate}}</div>
                <div class="links">
                  <a class="job_offline" @click="update(index,jobDetail.jobId)"  v-if="showdiffjobCode ==1">下线</a>
                  <a class="job_del" @click="deleteJob(index,jobDetail.jobId)"   v-if="showdiffjobCode ==0">删除</a>
                </div>
              </li>
            </ul>
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
      jobDetails:Array,
      deleteJobDetails:Function
    },
    methods:{
      update(index,jobId){
        const  job_ID = jobId;
        const  url = `http://localhost:8082/vuedeletejobdetail/${job_ID}/0`;
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          if (code == 1){
            this.deleteJobDetails(index)
            return
          }
          alert("下线招聘工作失败，请稍后重试！")
        }).catch(error=>{

        })
      },
      deleteJob(index,jobId){
        const  job_ID = jobId;
        const  url = `http://localhost:8082/vuedeletejobdetail/${job_ID}/3`;
        axios({
          url:url,
          method:'GET',
        }).then(response => {
          const  code = response.data
          if (code == 1){
            this.deleteJobDetails(index)
            return
          }
          alert("删除招聘工作失败，请稍后重试！")
        }).catch(error=>{
        })
      }

    }

  }
</script>

<style>

</style>

<template>
    <div>
      <dl class="company_center_content">
        <dt>
          <h1>
            <em></em>
            不合适简历 <span>（共1份）</span>                        </h1>
        </dt>
        <dd>
          <form action="haveRefuseResumes.html" method="get" id="filterForm">
            <div class="filter_options  dn ">
            </div><!-- end .filter_options -->	                        	                        		                        <ul class="reset resumeLists">
            <li v-for="(resumeShowDeail,index) in resumeShowDeails " :key="index"  data-id="1686182" class="onlineResume">
              <div class="resumeShow">
                <a title="预览在线简历" target="_blank" class="resumeImg" href="resumeView.html?deliverId=1686182">
                  <img src="../../../../style/images/default_headpic.png">
                </a>
                <div class="resumeIntro">
                  <h3 class="unread">
                    <a >
                      {{resumeShowDeail.resumeName}}的简历
                    </a>
                    <em></em>
                  </h3>
                  <span class="fr">投递时间：{{resumeShowDeail.deliveryDate}}</span>
                  <div>
                    {{resumeShowDeail.resumeName}}/ {{resumeShowDeail.resumeSex}}/ {{resumeShowDeail.resumeEduc}} / {{resumeShowDeail.resumeWorkYear}}	                                           				                                        		<br>
                  </div>
                  <div class="jdpublisher">
				                 <span>
				                  应聘职位：<a >{{resumeShowDeail.jobName}}</a>
				                 </span>
                  </div>
                </div>
                <div class="links">
                  <a  @click="deleteNot(resumeShowDeail.resumeUserId,resumeShowDeail.jobId,index)">删除</a>
                </div>
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
      resumeShowDeails:Array,//不合格简历列表
      updateResumeShowDeails:Function,
    },
    methods:{
      //删除不合格简历记录
      deleteNot(userId,jobId,index){
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


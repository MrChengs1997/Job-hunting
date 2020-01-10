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
          <form action="canInterviewResumes.html" method="get" id="filterForm">
                      	                        		                        <ul class="reset resumeLists">
            <li data-id="1686182" class="onlineResume">
              <label class="checkbox">
                <input type="checkbox">
                <i></i>
              </label>
              <div class="resumeShow">
                <a title="预览在线简历" target="_blank" class="resumeImg" href="resumeView.html?deliverId=1686182">
                  <img src="style/images/default_headpic.png">
                </a>
                <div class="resumeIntro">
                  <h3 class="unread">
                    <a target="_blank" title="预览jason的简历" href="resumeView.html?deliverId=1686182">
                      jason的简历
                    </a>
                    <em></em>
                  </h3>
                  <span class="fr">投递时间：2014-07-01 17:08</span>
                  <div>
                    jason  			                                        	 / 男 			                                        	/ 大专 			                                        	/ 3年  			                                        	/ 广州 			                                            			                                        		<br>
                    高级产品经理 · 上海辉硕科技有限公司 | 本科 · 北京大学
                  </div>
                  <div class="jdpublisher">
				                                        <span>
				                                        	应聘职位：<a title="随便写" target="_blank" href="http://www.lagou.com/jobs/149594.html">随便写</a>
				                                       						                                        </span>
                  </div>
                </div>
                <div class="links">
                  <a data-deliverid="1686182" data-name="jason" data-positionid="149594" data-email="888888888@qq.com" class="resume_notice" href="javascript:void(0)">通知面试</a>
                  <a data-deliverid="1686182" class="resume_refuse" href="javascript:void(0)">不合适</a>
                  <a data-resumename="jason的简历" data-positionname="随便写" data-deliverid="1686182" data-positionid="149594" data-resumekey="1ccca806e13637f7b1a4560f80f08057" data-forwardcount="1" class="resume_forward" href="javascript:void(0)">
                    转发
                    <span>(1人)</span>
                  </a>
                </div>
              </div>
              <div class="contactInfo">
                <span class="c9">电话：</span>18650216666   &nbsp;&nbsp;&nbsp;
                <span class="c9">邮箱：</span><a href="mailto:888888888@qq.com">888888888@qq.com</a>
              </div>
            </li>
          </ul><!-- end .resumeLists -->
          </form>
        </dd>
      </dl>
    </div>
</template>

<script>
  export default {
    props:{
      showdiffjobCode:Number
    }

  }
</script>

<style>

</style>

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
              <dl>
                <dt>简历状态：</dt>
                <dd>
                  <a rel="-1" class="current" href="javascript:;">不限</a>
                  <a rel="1" href="javascript:;">未阅读</a>
                  <a rel="2" href="javascript:;">已阅读</a>
                  <a rel="3" href="javascript:;">已转发</a>
                  <input type="hidden" value="-1" name="resumeStatus">
                </dd>
              </dl>
              <dl>
                <dt>简历形式：</dt>
                <dd>
                  <a rel="-1" class="current" href="javascript:;">不限</a>
                  <a rel="0" href="javascript:;">附件简历</a>
                  <a rel="1" href="javascript:;">在线简历</a>
                  <input type="hidden" value="-1" name="resumeType">
                </dd>
              </dl>
              <dl>
                <dt>工作经验：</dt>
                <dd>
                  <a rel="-1" class="current" href="javascript:;">不限</a>
                  <a rel="1" href="javascript:;">应届毕业生</a>
                  <a rel="2" href="javascript:;">一年以下</a>
                  <a rel="3" href="javascript:;">1-3年</a>
                  <a rel="4" href="javascript:;">3-5年</a>
                  <a rel="5" href="javascript:;">5-10年</a>
                  <a rel="6" href="javascript:;">10年以上</a>
                  <input type="hidden" value="-1" name="workExp">
                </dd>
              </dl>
              <dl>
                <dt>最低学历：</dt>
                <dd>
                  <a rel="-1" class="current" href="javascript:;">不限</a>
                  <a rel="1" href="javascript:;">大专及以上</a>
                  <a rel="2" href="javascript:;">本科及以上</a>
                  <a rel="3" href="javascript:;">硕士及以上</a>
                  <a rel="4" href="javascript:;">博士及以上</a>
                  <input type="hidden" value="-1" name="eduExp">
                </dd>
              </dl>
              <input type="hidden" value="0" name="filterStatus" id="filterStatus">
              <input type="hidden" value="" name="positionId" id="positionId">
            </div><!-- end .filter_options -->	                        	                        		                        <ul class="reset resumeLists">
            <li data-id="1686182" class="onlineResume">
              <label class="checkbox">
                <input type="checkbox">
                <i></i>
              </label>
              <div class="resumeShow">
                <a title="预览在线简历" target="_blank" class="resumeImg" href="resumeView.html?deliverId=1686182">
                  <img src="../../../../style/images/default_headpic.png">
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
                    jason/ 男/ 大专 / 3年/ 广州 			                                           				                                        		<br>
                    高级产品经理 · 上海辉硕科技有限公司 | 本科 · 北京大学
                  </div>
                  <div class="jdpublisher">
				                                        <span>
				                                        	应聘职位：<a title="随便写" target="_blank" href="http://www.lagou.com/jobs/149594.html">随便写</a>
				                                       						                                        </span>
                  </div>
                </div>
                <div class="links">
                  <a data-resumename="jason的简历" data-positionname="随便写" data-deliverid="1686182" data-positionid="149594" data-resumekey="1ccca806e13637f7b1a4560f80f08057" data-forwardcount="1" class="resume_forward" href="javascript:void(0)">
                    转发
                    <span>(1人)</span>
                  </a>
                  <a class="resume_del" href="javascript:void(0)">删除</a>
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
  export default {}
</script>

<style>

</style>

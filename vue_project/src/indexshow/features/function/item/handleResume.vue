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
                <ul class="reset my_jobs">
                  <li data-id="149594"  >
                    <h3>
                      <a >name</a>
                      <span>[{city}]</span>
                    </h3>
                    <span class="receivedResumeNo">工作列表（index）</span>
                    <div>部门： </div>
                    <div>职位名称： </div>
                    <div>工作类别： </div>
                    <div>职位性质： </div>
                    <div>薪资区间：</div>
                    <div>工作经验：</div>
                    <div>学历要求：</div>
                    <div>工作地点： </div>
                    <div>工作描述： </div>
                    <div class="c9" >发布时间： </div>
                    <div style="text-align:center" class="btn_sended" ><a>投递</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a>投递</a></div>
                    <div class="links">
                    </div>
                  </li>
                  <a href="list.html" class="btn fr" target="_blank">查看更多</a>
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
  export default {
    props:{
      showdiffjobCode:Number,
      resumeShowDeails:Array//查询简历详情
    }

  }
</script>

<style>

</style>

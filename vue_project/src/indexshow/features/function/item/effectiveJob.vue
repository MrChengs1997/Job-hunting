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
              <li data-id="149594">
                <h3>
                  <a target="_blank" title="随便写" href="http://www.lagou.com/jobs/149594.html">随便写</a>
                  <span>[上海]</span>
                </h3>
                <span class="receivedResumeNo"><a href="unHandleResumes.html?positionId=149594">应聘简历（1）</a></span>
                <div>兼职 / 1k-2k / 1-3年 / 硕士及以上</div>
                <div class="c9">发布时间： 2014-07-01 17:07:01</div>
                <div class="links">
                  <a class="job_refresh" href="javascript:void(0)">刷新<span>每个职位7天内只能刷新一次</span></a>
                  <a target="_blank" class="job_edit" href="create.html?positionId=149594">编辑</a>
                  <a class="job_offline" href="javascript:void(0)">下线</a>
                  <a class="job_del" href="javascript:void(0)">删除</a>
                </div>
              </li>
            </ul>
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

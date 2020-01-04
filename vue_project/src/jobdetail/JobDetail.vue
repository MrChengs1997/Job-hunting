<template>
  <div id="container">
    <div class="clearfix">
      <div class="content_l">
        <dl class="job_detail">
          <dt>
            <h1 title="内容运营">
              <em></em>
              <div>立方网运营部招聘</div>
              内容运营
            </h1>


            <a class="inline jd_collection" href="#loginPop" title="登录">
            </a>
          </dt>
          <dd class="job_request">
            <span class="red">4k-6k</span>
            <span>武汉</span>
            <span>经验3-5年 </span>
            <span> 本科及以上</span>
            <span>全职</span><br />
            职位诱惑 : 大家都来了 你还在等什么！！
            <div>发布时间：3天前发布</div>
          </dd>
          <dd class="job_bt">
            <h3 class="description">职位描述</h3>
            <p>岗位职责： <br />1、参与管理和维护立方网，保证网络社区健康、有序地运转，负责网站信息安全； <br />2、强化团队建设，提高团队工作效率，做好领导与员工直接沟通的桥梁； <br />3、制定和完善客服体系规章制度,培训新人。</p>
            <p>&nbsp;岗位要求： <br />1、2年以上互联网行业客服主管工作经验，本科及以上学历； <br />2、良好的沟通和协调能力、人际交往能力和语言表达能力； <br />3、较强的责任心和执行力，富有工作热情和团队协作能力。</p>
          </dd>

          <dd class="unresume">
            <div>
              你在拉勾还没有简历呢，你可以<a href="login.html" target="_blank" title="完善在线简历">完善在线简历</a>，也可<a class="inline" href="#loginPop" title="登录">上传附件简历</a>直接投递
            </div>
          </dd>
          <div class="saoma saoma_btm">
            <div class="dropdown_menu">
              <div class="drop_l">
                <img src="style/images/job_qr_btm.png" width="131" height="131" />
              </div>
              <div class="drop_r">
                <div class="drop_title"></div>
                <p>
                  想知道HR在看简历嘛？<br />
                  想在微信中收到面试通知？<br />
                  <span><< 扫一扫，给你解决</span>
                </p>
              </div>
            </div>
          </div>
          <dd>
            <a href="#loginPop" title="登录" class="inline btn fr btn_apply">投个简历</a>
          </dd>
        </dl>
        <div id="weibolist"></div>
      </div>
      <div class="content_r">
        <dl class="job_company">
          <dt>
            <a href="h/c/683.html" target="_blank">
              <img class="b2" src="../style/images/ff80808140ac5ed90140b953972e0215.png" width="80" height="80" alt="北京立方网信息技术有限公司" />
              <div>
                <h2 class="fl">
                  立方网

                  <img src="../style/images/valid.png" width="15" height="19" alt="拉勾认证企业" />
                  <span class="dn">拉勾认证企业</span>

                </h2>
              </div>
            </a>
          </dt>
          <dd>
            <ul class="c_feature reset">
              <li><span>领域</span> 移动互联网,游戏</li>
              <li><span>规模</span> 50-150人</li>
              <li>
                <span>主页</span>
                <a href="http://L99.com" target="_blank" title="http://L99.com" rel="nofollow">http://L99.com</a>
              </li>
            </ul>

            <h4>发展阶段</h4>
            <ul class="c_feature reset">
              <li><span>目前阶段</span> A轮</li>
              <li><span>投资机构</span> IDG(A轮)，腾讯(A轮)</li>
            </ul>

            <!--	                    	<h4>公司产品</h4>
                <ul class="c_feature reset">
                                                        <li><span>在哪</span></li>
                                                        <li><span>立方网</span></li>
                                                        <li><span>立方飞鸽</span></li>
                                                </ul>

               <h4>公司标签</h4>
            <ul class="company_tags reset" id="hasLabels">
                                                <li><span>专业主厨</span></li>
                                                <li><span>帅哥多</span></li>
                                                <li><span>扁平管理</span></li>
                                                <li><span>弹性工作</span></li>
                                                <li><span>岗位晋升</span></li>
                                                <li><span>领导好</span></li>
                                           <li class="link"><a>编辑</a></li>
            </ul>
            <div class="clear"></div>
            <div id="addLabel" class="addLabel dn">
                <input type="text" class="fl" id="label" name="label" placeholder="添加自定义标签" />
                <input type="submit" id="add" value="贴上" />
            </div> -->

            <h4>工作地址</h4>
            <div>武汉市武昌区螃蟹岬凤凰大厦A1-1301</div>

          </dd>
        </dl>

      </div>
    </div>
    <input type="hidden" value="" name="userid" id="userid" />
    <input type="hidden" value="" name="type" id="resend_type" />
    <input type="hidden" value="140204"  id="jobid" />
    <input type="hidden" value="683"  id="companyid" />
    <input type="hidden" value="" id="positionLng" />
    <input type="hidden" value="" id="positionLat" />


    <div id="tipOverlay" ></div>


    <div class="clear"></div>

  </div>
</template>

<script>
    export default {}
</script>

<style>
  #cboxContent{overflow:visible;}
  #colorbox, #cboxOverlay, #cboxWrapper{overflow:visible;}
</style>

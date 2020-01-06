<template>
  <div id="container">

    <div style="" id="stepTip">
      <a></a>
      <img width="803" height="59" src="../../style/images/tiponce.jpg">
    </div>
    <div class="content_mid">
      <dl class="c_section c_section_mid">
        <dt>
          <h2><em></em>填写公司信息</h2>
        </dt>
        <dd>
          <form id="stepForm">
            <div class="c_text_1">基本信息为必填项，是求职者加速了解公司的窗口，认真填写吧！</div>
            <img width="668" height="56" class="c_steps" alt="第一步" src="style/images/step1.png">

            <h3>公司全称 <span>福建平潭协创进出口贸易有限公司</span></h3>

            <h3>公司简称</h3> <!--非必填-->
            <input type="text" placeholder="请输入公司简称，如:拉勾" value="" name="name" id="name" class="valid">

            <h3>公司LOGO</h3> <!--非必填改必填-->
            <div class="c_logo c_logo_pos">
              <a title="上传公司LOGO" class="inline cboxElement" href="#logoUploader">
                <div id="logoNo">
                  <span>上传公司LOGO</span> <br>
                  尺寸：190*190px  <br>
                  大小：小于5M
                </div>
                <div class="dn" id="logoShow">
                  <img width="190" height="190" alt="公司logo" src="">
                  <span>更换公司LOGO<br>190px*190px 小于5M</span>
                </div>
              </a>
            </div>

            <h3>公司网址</h3>
            <input type="text" placeholder="请输入公司网址" value="" name="website" id="website">

            <h3>所在城市</h3>
            <input type="text" placeholder="请输入工作城市，如：北京" name="city" id="city">

            <h3>行业领域</h3>
            <div>
              <input type="hidden" value="" name="select_industry_hidden" id="select_industry_hidden">
              <input type="button" value="请选择行业领域" name="select_industry" id="select_industry" class="select">
              <div class="dn" id="box_industry" style="display: none;">
                <ul class="reset">
                  <li>移动互联网</li>
                  <li>电子商务</li>
                  <li>社交</li>
                  <li>企业服务</li>
                  <li>O2O</li>
                  <li>教育</li>
                  <li>文化艺术</li>
                  <li>游戏</li>
                  <li>在线旅游</li>
                  <li>金融互联网</li>
                  <li>健康医疗</li>
                  <li>生活服务</li>
                  <li>硬件</li>
                  <li>搜索</li>
                  <li>安全</li>
                  <li>运动体育</li>
                  <li>云计算\大数据</li>
                  <li>移动广告</li>
                  <li>社会化营销</li>
                  <li>视频多媒体</li>
                  <li>媒体</li>
                  <li>智能家居</li>
                  <li>智能电视</li>
                  <li>分类信息</li>
                  <li>招聘</li>
                </ul>
              </div>
            </div>

            <h3>公司规模</h3>
            <div>
              <input type="hidden" value="" name="select_scale_hidden" id="select_scale_hidden">
              <input type="button" value="请选择公司规模" id="select_scale" class="select">
              <div class="dn" id="box_scale" style="display: none;">
                <ul class="reset">
                  <li>少于15人</li>
                  <li>15-50人</li>
                  <li>50-150人</li>
                  <li>150-500人</li>
                  <li>500-2000人</li>
                  <li>2000人以上</li>
                </ul>
              </div>
            </div>

            <h3>发展阶段</h3>
            <div>
              <input type="hidden" id="s_radio_hidden" name="s_radio_hidden" value="">
              <ul class="s_radio clearfix s_radio_ex">
                <li>未融资</li>
                <li>天使轮</li>
                <li>A轮</li>
                <li>B轮</li>
                <li>C轮</li>
                <li>D轮及以上</li>
                <li>上市公司</li>
              </ul>
            </div>

            <h3>投资机构</h3>
            <ul id="stagesList" class="reset">
              <li>
                <input type="hidden" class="select_invest_hidden" name="select_invest_hidden">
                <input type="button" value="请选择发展阶段" class="select_short select_invest">
                <div class="box_invest dn" style="display: none;">
                  <ul class="reset">
                    <li>天使轮</li>
                    <li>A轮</li>
                    <li>B轮</li>
                    <li>C轮</li>
                    <li>D轮及以上</li>
                    <li>上市公司</li>
                  </ul>
                </div>
                <input type="text" placeholder="请输入投资机构，如真格基金，创新工场" name="stageorg">
              </li>
            </ul>
            <div class="dn" id="cloneInvest">
              <input type="hidden" class="select_invest_hidden" name="select_invest_hidden">
              <input type="button" value="请选择发展阶段" class="select_short select_invest">
              <div class="box_invest dn">
                <ul class="reset">
                  <li>天使轮</li>
                  <li>A轮</li>
                  <li>B轮</li>
                  <li>C轮</li>
                  <li>D轮及以上</li>
                  <li>上市公司</li>
                </ul>
              </div>
              <input type="text" placeholder="请输入投资机构，如真格基金，创新工场" name="stageorg">
            </div>

            <h3>一句话介绍</h3>
            <input type="text" placeholder="一句话概括公司亮点，如公司愿景、领导团队等，限50字" maxlength="50" name="temptation" id="temptation">
            <span style="display:none;" class="error" id="beError"></span>
            <input type="hidden" id="companyId" name="companyId" value="25927">
            <input type="hidden" id="companyName" name="companyName" value="福建平潭协创进出口贸易有限公司">
            <input type="submit" value="保存，下一步" id="stepBtn" class="btn_big fr">
          </form>
        </dd>
      </dl>
    </div>

    <!-------------------------------------弹窗lightbox  ----------------------------------------->
    <div style="display:none;">
      <!--图片上传-->
      <div style="width:650px;height:470px;" class="popup" id="logoUploader">
        <object width="650" height="470" classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" id="FlashID">
          <param value="../../flash/avatar.swf?url=http://www.lagou.com/cd/saveProfileLogo.json" name="movie">
          <param value="high" name="quality">
          <param value="opaque" name="wmode">
          <param value="111.0.0.0" name="swfversion">
          <!-- 此 param 标签提示使用 Flash Player 6.0 r65 和更高版本的用户下载最新版本的 Flash Player。如果您不想让用户看到该提示，请将其删除。 -->
          <param value="../../Scripts/expressInstall.swf" name="expressinstall">
          <!-- 下一个对象标签用于非 IE 浏览器。所以使用 IECC 将其从 IE 隐藏。 -->
          <!--[if !IE]>-->
          <object width="650" height="470" data="../../flash/avatar.swf?url=http://www.lagou.com/cd/saveProfileLogo.json" type="application/x-shockwave-flash">
            <!--<![endif]-->
            <param value="high" name="quality">
            <param value="opaque" name="wmode">
            <param value="111.0.0.0" name="swfversion">
            <param value="../../Scripts/expressInstall.swf" name="expressinstall">
            <!-- 浏览器将以下替代内容显示给使用 Flash Player 6.0 和更低版本的用户。 -->
            <div>
              <h4>此页面上的内容需要较新版本的 Adobe Flash Player。</h4>
              <p><a href="http://www.adobe.com/go/getflashplayer"><img width="112" height="33" src="style/images/get_flash_player.gif" alt="获取 Adobe Flash Player"></a></p>
            </div>
            <!--[if !IE]>-->
          </object>
          <!--<![endif]-->
        </object>
      </div><!-- #logoUploader -->
    </div>
    <!------------------------------------- end ----------------------------------------->
    <div class="clear"></div>
  </div>
</template>

<script>
    export default {}
</script>

<style>
</style>

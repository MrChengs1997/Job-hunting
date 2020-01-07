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
<!--            <img width="668" height="56" class="c_steps" alt="第一步" src="../../style/images/step1.png">-->

            <h3>公司全称 <span>福建平潭协创进出口贸易有限公司</span></h3>

            <h3>公司简称</h3> <!--非必填-->
            <input type="text" placeholder="请输入公司简称，如:拉勾" value="" name="name" id="name" class="valid">

            <h3>公司LOGO</h3> <!--非必填改必填-->
            <div class="c_logo c_logo_pos">
              <input type="file" class="inline cboxElement" >
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
              <select id="select_industry" class="select">
                <option value="a.html">移动互联网</option>
                <option value="a.html">电子商务</option>
                <option value="a.html">社交</option>
                <option value="a.html">O2O</option>
                <option value="a.html">教育</option>
                <option value="a.html">文化艺术</option>
                <option value="a.html">游戏</option>
                <option value="a.html">在线旅游</option>
                <option value="a.html">金融互联网</option>
                <option value="a.html">健康医疗</option>
                <option value="a.html">生活服务</option>
                <option value="b.html">硬件</option>
                <option value="b.html">搜索</option>
                <option value="b.html">安全</option>
                <option value="b.html">运动体育</option>
                <option value="b.html">云计算\大数据</option>
                <option value="b.html">移动广告</option>
                <option value="b.html">社会化营销</option>
                <option value="b.html">视频多媒体</option>
                <option value="b.html">媒体</option>
                <option value="b.html">视频多媒体</option>
                <option value="b.html">智能家居</option>
                <option value="b.html">分类信息</option>
                <option value="b.html">智能电视</option>
                <option value="b.html">招聘</option>
              </select>
            </div>

            <h3>公司规模</h3>
            <div>
              <select id="select_industry1" class="select">
                <option value="a.html">少于15人</option>
                <option value="a.html">15-50人</option>
                <option value="a.html">50-150人</option>
                <option value="a.html">150-500人</option>
                <option value="a.html">500-2000人</option>
                <option value="a.html">2000人以上</option>
              </select>
            </div>

            <h3>发展阶段</h3>
            <div>
              <select  class="select">
                <option value="a.html">天使轮</option>
                <option value="a.html">A轮</option>
                <option value="a.html">B轮</option>
                <option value="a.html">C轮</option>
                <option value="a.html">D轮及以上</option>
                <option value="a.html">上市公司</option>
              </select>
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

    <div class="clear"></div>
  </div>
</template>

<script>
  import '../../style/css/style.css'
  import '../../style/css/external.min.css'
  import '../../style/css/popup.css'
  import '../../style/css/popup.css'

    export default {}
</script>

<style>
</style>

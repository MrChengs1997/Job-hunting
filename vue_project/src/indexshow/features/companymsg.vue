<template>
  <div id="container">
    <div class="clearfix">
      <div class="content_l">
        <div class="c_detail">
          <div style="background-color:#fff;" class="c_logo">
            <a title="上传公司LOGO" id="logoShow" class="inline cboxElement" href="#logoUploader">
              <img width="190" height="190" alt="公司logo" src="../../style/images/logo_default.png">
              <span>更换公司图片<br>190px*190px 小于5M</span>
            </a>
          </div>
          <div class="c_box companyName">
            <h2  title="company.companyWholeName">{{company.companyWholeName}}</h2>
            <em class="unvalid"></em>
            <span class="va dn">拉勾认证企业</span>
            <a target="_blank" class="applyC" href="http://www.lagou.com/c/auth.html">申请认证</a>
            <div class="clear"></div>
            <h1 title="福建平潭协创进出口贸易有限公司" class="fullname">{{company.compamyShortName}}</h1>
            <div class="clear oneword"><img width="17" height="15" src="../../style/images/quote_l.png">&nbsp; <span>{{company.companyProfile}}</span> &nbsp;<img width="17" height="15" src="../../style/images/quote_r.png"></div>
          </div>
          <div class="clear"></div>
        </div>
        <div class="c_breakline"></div>
        <div id="Profile">
          <div class="profile_wrap">
            <!--有介绍-->
            <dl class="c_section">
              <dt>
                <h2><em></em>公司介绍</h2>
              </dt>
              <dd>
                <div class="c_intro">{{company.companyProfile}}</div>
              </dd>
            </dl>
          </div>
        </div><!-- end #Profile -->
      </div>	<!-- end .content_l -->

      <div class="content_r">
        <div id="Tags">
          <div id="c_tags_show" class="c_tags solveWrap">
            <table>
              <tbody><tr>
                <td width="45">地点</td>
                <td>{{company.companyLocation}}</td>
              </tr>
              <tr>
                <td>领域</td><!-- 支持多选 -->
                <td title="company.companyField">{{company.companyField}}</td>
              </tr>
              <tr>
                <td>规模</td>
                <td>{{company.companySize}}</td>
              </tr>
              <tr>
                <td>主页</td>
                <td>
                  <a rel="nofollow" :title="company.companyWebsite" target="_blank" :href="company.companyWebsite">{{company.companyWebsite}}</a>
                </td>
              </tr>
              </tbody>
            </table>
          </div>
        </div><!-- end #Tags -->

        <dl class="c_section c_stages">
          <dt>
            <h2><em></em>融资阶段</h2>
            <a title="编辑融资阶段" class="c_edit" href="javascript:void(0)"></a>
          </dt>
          <dd>
            <ul class="reset stageshow">
              <li>目前阶段：<span class="c5">{{company.companyDevelopment}}</span></li>
            </ul>
          </dd>
        </dl><!-- end .c_stages -->

        <div id="Member">
          <dl class="c_section c_stages">
            <dt>
              <h2><em></em>公司创始人</h2>
              <a title="公司创始人" class="c_edit" href="javascript:void(0)"></a>
            </dt>
            <dd>
              <ul class="reset stageshow">
                <li>CEO：<span class="c5">{{company.companyCeo}}</span></li>
              </ul>
            </dd>
          </dl><!-- end .c_stages -->
        </div> <!-- end #Member -->
      </div>
    </div>
    <div class="clear"></div>
  </div>
</template>

<script>
    export default {
      props:{
        company:Object
      }
    }
</script>

<style>
</style>

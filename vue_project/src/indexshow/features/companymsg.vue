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
            <h2 title="平潭协创进出口贸易有限公司">平潭协创进出口贸易有限公司</h2>
            <em class="unvalid"></em>
            <span class="va dn">拉勾未认证企业</span>
            <a target="_blank" class="applyC" href="http://www.lagou.com/c/auth.html">申请认证</a>
            <div class="clear"></div>
            <h1 title="福建平潭协创进出口贸易有限公司" class="fullname">福建平潭协创进出口贸易有限公司</h1>
            <form class="clear editDetail dn" id="editDetailForm">
              <input type="text" placeholder="请输入公司简称" maxlength="15" value="平潭协创进出口贸易有限公司" name="companyShortName" id="companyShortName">
              <input type="text" placeholder="一句话描述公司优势，核心价值，限50字" maxlength="50" value="测试的发打发打发大范德萨发" name="companyFeatures" id="companyFeatures">
              <input type="hidden" value="25927" id="companyId" name="companyId">
              <input type="submit" value="保存" id="saveDetail" class="btn_small">
              <a id="cancelDetail" class="btn_cancel_s" >取消</a>
            </form>
            <div class="clear oneword"><img width="17" height="15" src="style/images/quote_l.png">&nbsp; <span>测试的发打发打发大范德萨发</span> &nbsp;<img width="17" height="15" src="style/images/quote_r.png"></div>
          </div>
          <a title="编辑基本信息" class="c_edit" id="editCompanyDetail" href="javascript:void(0);"></a>
          <div class="clear"></div>
        </div>
        <div class="c_breakline"></div>
        <div id="Profile">
          <div class="profile_wrap">
            <!--无介绍 -->
            <dl class="c_section dn">
              <dt>
                <h2><em></em>公司介绍</h2>
              </dt>
              <dd>
                <div class="addnew">
                  详细公司的发展历程、让求职者更加了解你!<br>
                  <a id="addIntro" href="javascript:void(0)">+添加公司介绍</a>
                </div>
              </dd>
            </dl>
            <!--编辑介绍-->
            <dl class="c_section newIntro dn">
              <dt>
                <h2><em></em>公司介绍</h2>
              </dt>
              <dd>
                <form id="companyDesForm">
                  <textarea placeholder="请分段详细描述公司简介、企业文化等" name="companyProfile" id="companyProfile">该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎</textarea>
                  <div class="word_count fr">你还可以输入 <span>1000</span> 字</div>
                  <div class="clear"></div>
                  <input type="submit" value="保存" id="submitProfile" class="btn_small">
                  <a id="delProfile" class="btn_cancel_s" href="javascript:void(0)">取消</a>
                </form>
              </dd>
            </dl>

            <!--有介绍-->
            <dl class="c_section">
              <dt>
                <h2><em></em>公司介绍</h2>
              </dt>
              <dd>
                <div class="c_intro">该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎该方法嘎嘎</div>
                <a title="编辑公司介绍" id="editIntro" class="c_edit" href="javascript:void(0)"></a>
              </dd>
            </dl>
          </div>

        </div><!-- end #Profile -->

        <!--[if IE 7]> <br /> <![endif]-->

        <!--无招聘职位-->
        <dl id="noJobs" class="c_section">
          <dt>
            <h2><em></em>招聘职位</h2>
          </dt>
          <dd>
            <div class="addnew">
              发布需要的人才信息，让伯乐和千里马尽快相遇……<br>
              <a href="create.html">+添加招聘职位</a>
            </div>
          </dd>
        </dl>

        <input type="hidden" value="" name="hasNextPage" id="hasNextPage">
        <input type="hidden" value="" name="pageNo" id="pageNo">
        <input type="hidden" value="" name="pageSize" id="pageSize">
        <div id="flag"></div>
      </div>	<!-- end .content_l -->

      <div class="content_r">
        <div id="Tags">
          <div id="c_tags_show" class="c_tags solveWrap">
            <table>
              <tbody><tr>
                <td width="45">地点</td>
                <td>上海</td>
              </tr>
              <tr>
                <td>领域</td><!-- 支持多选 -->
                <td title="移动互联网">移动互联网</td>
              </tr>
              <tr>
                <td>规模</td>
                <td>150-500人</td>
              </tr>
              <tr>
                <td>主页</td>
                <td>
                  <a rel="nofollow" title="http://www.weimob.com" target="_blank" href="http://www.weimob.com">http://www.weim...</a>
                </td>
              </tr>
              </tbody></table>
            <a id="editTags" class="c_edit" href="javascript:void(0)"></a>
          </div>
          <div id="c_tags_edit" class="c_tags editTags dn">
            <form id="tagForms">
              <table>
                <tbody><tr>
                  <td>地点</td>
                  <td>
                    <input type="text" placeholder="请输入地点" value="上海" name="city" id="city">
                  </td>
                </tr>
                <tr>
                  <td>领域</td><!-- 支持多选 -->
                  <td>
                    <input type="hidden" value="移动互联网" id="industryField" name="industryField">
                    <input type="button" style="background:none;cursor:default;border:none !important;" disable="disable" value="移动互联网" id="select_ind" class="select_tags">
                    <!-- <div id="box_ind" class="selectBox dn">
                            <ul class="reset">
                                                                                                                                            <li class="current">移动互联网</li>
                                                                                                                                </ul>
                        </div>	 -->
                  </td>
                </tr>
                <tr>
                  <td>规模</td>
                  <td>
                    <input type="hidden" value="150-500人" id="companySize" name="companySize">
                    <input type="button" value="150-500人" id="select_sca" class="select_tags">
                    <div class="selectBox dn" id="box_sca" style="display: none;">
                      <ul class="reset">
                        <li>少于15人</li>
                        <li>15-50人</li>
                        <li>50-150人</li>
                        <li class="current">150-500人</li>
                        <li>500-2000人</li>
                        <li>2000人以上</li>
                      </ul>
                    </div>
                  </td>
                </tr>
                <tr>
                  <td>主页</td>
                  <td>
                    <input type="text" placeholder="请输入网址" value="http://www.weimob.com" name="companyUrl" id="companyUrl">
                  </td>
                </tr>
                </tbody></table>
              <input type="hidden" id="comCity" value="上海">
              <input type="hidden" id="comInd" value="移动互联网">
              <input type="hidden" id="comSize" value="150-500人">
              <input type="hidden" id="comUrl" value="http://www.zmtpost.com">
              <input type="submit" value="保存" id="submitFeatures" class="btn_small">
              <a id="cancelFeatures" class="btn_cancel_s" href="javascript:void(0)">取消</a>
              <div class="clear"></div>
            </form>
          </div>
        </div><!-- end #Tags -->

        <dl class="c_section c_stages">
          <dt>
            <h2><em></em>融资阶段</h2>
            <a title="编辑融资阶段" class="c_edit" href="javascript:void(0)"></a>
          </dt>
          <dd>
            <ul class="reset stageshow">
              <li>目前阶段：<span class="c5">天使轮</span></li>
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
                <li>CEO：<span class="c5">MrChengs</span></li>
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
    export default {}
</script>

<style>
</style>

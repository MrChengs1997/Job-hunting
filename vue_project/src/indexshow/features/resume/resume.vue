<template>

      <div class="content_l">
        <div class="fl" id="resume_name">
          <div class="nameShow fl">
            <h1 title="jason的简历">jason的简历</h1>
            <span class="rename">重命名</span> | <a >预览</a>
          </div>
          <form class="fl dn" id="resumeNameForm">
            <input type="text" value="jason的简历" name="resumeName" class="nameEdit c9">
            <input type="submit" value="保存"> | <a >预览</a>
          </form>
        </div><!--end #resume_name-->
        <div class="fr c5" id="lastChangedTime">最后一次更新：<span>2014-07-01 15:14 </span></div><!--end #lastChangedTime-->

        <div class="profile_box" id="basicInfo">
          <h2>基本信息</h2>
          <span class="c_edit"></span>
          <div class="basicShow">
            			            			<span>jason |  男 |    大专 |  3年工作经验<br>
            			            			18644444444 | jason@qq.com<br>
            			</span>
            <div class="m_portrait">
              <div></div>
              <img width="120" height="120" alt="jason" src="../../../style/images/default_headpic.png">
            </div>
          </div><!--end .basicShow-->

          <div class="basicEdit dn">
            <form id="profileForm">
              <table>
                <tbody><tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="姓名" value="jason" name="name" id="name">
                  </td>
                  <td valign="top"></td>
                  <td>
                    <ul class="profile_radio clearfix reset">
                      <li class="current">
                        男<em></em>
                        <input type="radio" checked="checked" name="gender" value="男">
                      </li>
                      <li>
                        女<em></em>
                        <input type="radio" name="gender" value="女">
                      </li>
                    </ul>
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="hidden" id="topDegree" value="大专" name="topDegree">
                    <input type="button" value="大专" id="select_topDegree" class="profile_select_190 profile_select_normal">
                    <div class="boxUpDown boxUpDown_190 dn" id="box_topDegree" style="display: none;">
                      <ul>
                        <li>大专</li>
                        <li>本科</li>
                        <li>硕士</li>
                        <li>博士</li>
                        <li>其他</li>
                      </ul>
                    </div>
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="hidden" id="workyear" value="" name="workyear">
                    <input type="button" value="" id="select_workyear" class="profile_select_190 profile_select_normal">
                    <div class="boxUpDown boxUpDown_190 dn" id="box_workyear" style="display: none;">
                      <ul>
                        <li>应届毕业生</li>
                        <li>1年</li>
                        <li>2年</li>
                        <li>3年</li>
                        <li>4年</li>
                        <li>5年</li>
                        <li>6年</li>
                        <li>7年</li>
                        <li>8年</li>
                        <li>9年</li>
                        <li>10年</li>
                        <li>10年以上</li>
                      </ul>
                    </div>
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td colspan="3">
                    <input type="text" placeholder="手机号码" value="18644444444" name="tel" id="tel">
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td colspan="3">
                    <input type="text" placeholder="接收面试通知的邮箱" value="jason@qq.com" name="email" id="email">
                  </td>
                </tr>
                <tr>
                  <td valign="top"> </td>
                  <td colspan="3">
                    <input type="hidden" id="currentState" value="" name="currentState">
                    <input type="button" value="目前状态" id="select_currentState" class="profile_select_410 profile_select_normal">
                    <div class="boxUpDown boxUpDown_410 dn" id="box_currentState" style="display: none;">
                      <ul>
                        <li>我目前已离职，可快速到岗</li>
                        <li>我目前正在职，正考虑换个新环境</li>
                        <li>我暂时不想找工作</li>
                        <li>我是应届毕业生</li>
                      </ul>
                    </div>
                  </td>
                </tr>
                <tr>
                  <td></td>
                  <td colspan="3">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
            </form><!--end #profileForm-->
            <div class="new_portrait">
              <div class="portrait_upload" id="portraitNo">
                <span>上传自己的头像</span>
              </div>
              <div class="portraitShow dn" id="portraitShow">
                <img width="120" height="120" src="">
                <span>更换头像</span>
              </div>
              <input type="file" value="" title="支持jpg、jpeg、gif、png格式，文件小于5M" onchange="img_check(this,'h/resume/uploadPhoto.json','headPic');" name="headPic" id="headPic" class="myfiles">
              <!-- <input type="hidden" id="headPicHidden" /> -->
              <em>
                尺寸：120*120px <br>
                大小：小于5M
              </em>
              <span style="display:none;" id="headPic_error" class="error"></span>
            </div><!--end .new_portrait-->
          </div><!--end .basicEdit-->
          <input type="hidden" id="nameVal" value="jason">
          <input type="hidden" id="genderVal" value="男">
          <input type="hidden" id="topDegreeVal" value="大专">
          <input type="hidden" id="workyearVal" value="3年">
          <input type="hidden" id="currentStateVal" value="">
          <input type="hidden" id="emailVal" value="jason@qq.com">
          <input type="hidden" id="telVal" value="18644444444">
          <input type="hidden" id="pageType" value="1">
        </div><!--end #basicInfo-->

        <div class="profile_box" id="expectJob">
          <h2>期望工作</h2>
          <span class="c_edit dn"></span>
          <div class="expectShow dn">
            <span></span>
          </div><!--end .expectShow-->
          <div class="expectEdit dn">
            <form id="expectForm">
              <table>
                <tbody><tr>
                  <td>
                    <input type="hidden" id="expectCity" value="" name="expectCity">
                    <input type="button" value="期望城市，如：北京" id="select_expectCity" class="profile_select_287 profile_select_normal">
                    <div class="boxUpDown boxUpDown_596 dn" id="box_expectCity" style="display: none;">
                      <dl>
                        <dt>热门城市</dt>
                        <dd>
                          <span>北京</span>
                          <span>上海</span>
                          <span>广州</span>
                          <span>深圳</span>
                          <span>成都</span>
                          <span>杭州</span>
                        </dd>
                      </dl>
                      <dl>
                        <dt>ABCDEF</dt>
                        <dd>
                          <span>北京</span>
                          <span>长春</span>
                          <span>成都</span>
                          <span>重庆</span>
                          <span>长沙</span>
                          <span>常州</span>
                          <span>东莞</span>
                          <span>大连</span>
                          <span>佛山</span>
                          <span>福州</span>
                        </dd>
                      </dl>
                      <dl>
                        <dt>GHIJ</dt>
                        <dd>
                          <span>贵阳</span>
                          <span>广州</span>
                          <span>哈尔滨</span>
                          <span>合肥</span>
                          <span>海口</span>
                          <span>杭州</span>
                          <span>惠州</span>
                          <span>金华</span>
                          <span>济南</span>
                          <span>嘉兴</span>
                        </dd>
                      </dl>
                      <dl>
                        <dt>KLMN</dt>
                        <dd>
                          <span>昆明</span>
                          <span>廊坊</span>
                          <span>宁波</span>
                          <span>南昌</span>
                          <span>南京</span>
                          <span>南宁</span>
                          <span>南通</span>
                        </dd>
                      </dl>
                      <dl>
                        <dt>OPQR</dt>
                        <dd>
                          <span>青岛</span>
                          <span>泉州</span>
                        </dd>
                      </dl>
                      <dl>
                        <dt>STUV</dt>
                        <dd>
                          <span>上海</span>
                          <span>石家庄</span>
                          <span>绍兴</span>
                          <span>沈阳</span>
                          <span>深圳</span>
                          <span>苏州</span>
                          <span>天津</span>
                          <span>太原</span>
                          <span>台州</span>
                        </dd>
                      </dl>
                      <dl>
                        <dt>WXYZ</dt>
                        <dd>
                          <span>武汉</span>
                          <span>无锡</span>
                          <span>温州</span>
                          <span>西安</span>
                          <span>厦门</span>
                          <span>烟台</span>
                          <span>珠海</span>
                          <span>中山</span>
                          <span>郑州</span>
                        </dd>
                      </dl>
                    </div>
                  </td>
                  <td>
                    <ul class="profile_radio clearfix reset">
                      <li class="current">
                        全职<em></em>
                        <input type="radio" checked="" name="type" value="全职">
                      </li>
                      <li>
                        兼职<em></em>
                        <input type="radio" name="type" value="兼职">
                      </li>
                      <li>
                        实习<em></em>
                        <input type="radio" name="type" value="实习">
                      </li>
                    </ul>
                  </td>
                </tr>
                <tr>
                  <td>
                    <input type="text" placeholder="期望职位，如：产品经理" value="" name="expectPosition" id="expectPosition">
                  </td>
                  <td>
                    <input type="hidden" id="expectSalary" value="" name="expectSalary">
                    <input type="button" value="期望月薪" id="select_expectSalary" class="profile_select_287 profile_select_normal">
                    <div class="boxUpDown boxUpDown_287 dn" id="box_expectSalary" style="display: none;">
                      <ul>
                        <li>2k以下</li>
                        <li>2k-5k</li>
                        <li>5k-10k</li>
                        <li>10k-15k</li>
                        <li>15k-25k</li>
                        <li>25k-50k</li>
                        <li>50k以上</li>
                      </ul>
                    </div>
                  </td>
                </tr>
                <tr>
                  <td colspan="2">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
            </form><!--end #expectForm-->
          </div><!--end .expectEdit-->
          <div class="expectAdd pAdd">
            填写准确的期望工作能大大提高求职成功率哦…<br>
            快来添加期望工作吧！
            <span>添加期望工作</span>
          </div><!--end .expectAdd-->

          <input type="hidden" id="expectJobVal" value="">
          <input type="hidden" id="expectCityVal" value="">
          <input type="hidden" id="typeVal" value="">
          <input type="hidden" id="expectPositionVal" value="">
          <input type="hidden" id="expectSalaryVal" value="">
        </div><!--end #expectJob-->

        <div class="profile_box" id="workExperience">
          <h2>工作经历  <span> （投递简历时必填）</span></h2>
          <span class="c_add dn"></span>
          <div class="experienceShow dn">
            <form class="experienceForm borderBtm dn">
              <table>
                <tbody><tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="公司名称" name="companyName" class="companyName">
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="职位名称，如：产品经理" name="positionName" class="positionName">
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="companyYearStart" value="" name="companyYearStart">
                      <input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_companyYearStart">
                      <div class="box_companyYearStart boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="companyMonthStart" value="" name="companyMonthStart">
                      <input type="button" value="开始月份" class="profile_select_139 profile_select_normal select_companyMonthStart">
                      <div style="display: none;" class="box_companyMonthStart boxUpDown boxUpDown_139 dn">
                        <ul>
                          <li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li><li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="companyYearEnd" value="" name="companyYearEnd">
                      <input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_companyYearEnd">
                      <div class="box_companyYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>至今</li>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="companyMonthEnd" value="" name="companyMonthEnd">
                      <input type="button" value="结束月份" class="profile_select_139 profile_select_normal select_companyMonthEnd">
                      <div style="display: none;" class="box_companyMonthEnd boxUpDown boxUpDown_139 dn">
                        <ul>
                          <li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li><li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                </tr>
                <tr>
                  <td></td>
                  <td colspan="3">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
              <input type="hidden" class="expId" value="">
            </form><!--end .experienceForm-->

            <ul class="wlist clearfix">
            </ul>
          </div><!--end .experienceShow-->
          <div class="experienceEdit dn">
            <form class="experienceForm">
              <table>
                <tbody><tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="公司名称" name="companyName" class="companyName">
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="职位名称，如：产品经理" name="positionName" class="positionName">
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="companyYearStart" value="" name="companyYearStart">
                      <input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_companyYearStart">
                      <div class="box_companyYearStart boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="companyMonthStart" value="" name="companyMonthStart">
                      <input type="button" value="开始月份" class="profile_select_139 profile_select_normal select_companyMonthStart">
                      <div style="display: none;" class="box_companyMonthStart boxUpDown boxUpDown_139 dn">
                        <ul>
                          <li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li><li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="companyYearEnd" value="" name="companyYearEnd">
                      <input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_companyYearEnd">
                      <div class="box_companyYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>至今</li>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="companyMonthEnd" value="" name="companyMonthEnd">
                      <input type="button" value="结束月份" class="profile_select_139 profile_select_normal select_companyMonthEnd">
                      <div style="display: none;" class="box_companyMonthEnd boxUpDown boxUpDown_139 dn">
                        <ul>
                          <li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li><li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                </tr>
                <tr>
                  <td></td>
                  <td colspan="3">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
              <input type="hidden" class="expId" value="">
            </form><!--end .experienceForm-->
          </div><!--end .experienceEdit-->

          <div class="experienceAdd pAdd">
            工作经历最能体现自己的工作能力，<br>
            且完善后才可投递简历哦！
            <span>添加工作经历</span>
          </div><!--end .experienceAdd-->
        </div><!--end #workExperience-->

        <div class="profile_box" id="projectExperience">
          <h2>项目经验</h2>
          <span class="c_add dn"></span>
          <div class="projectShow dn">
            <ul class="plist clearfix">
            </ul>
          </div><!--end .projectShow-->
          <div class="projectEdit dn">
            <form class="projectForm">
              <table>
                <tbody><tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="项目名称" name="projectName" class="projectName">
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="担任职务，如：产品负责人" name="thePost" class="thePost">
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="projectYearStart" value="" name="projectYearStart">
                      <input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_projectYearStart">
                      <div class="box_projectYearStart  boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="projectMonthStart" value="" name="projectMonthStart">
                      <input type="button" value="开始月份" class="profile_select_139 profile_select_normal select_projectMonthStart">
                      <div style="display: none;" class="box_projectMonthStart boxUpDown boxUpDown_139 dn">
                        <ul>
                          <li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li><li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="projectYearEnd" value="" name="projectYearEnd">
                      <input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_projectYearEnd">
                      <div class="box_projectYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>至今</li>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="projectMonthEnd" value="" name="projectMonthEnd">
                      <input type="button" value="结束月份" class="profile_select_139 profile_select_normal select_projectMonthEnd">
                      <div style="display: none;" class="box_projectMonthEnd boxUpDown boxUpDown_139 dn">
                        <ul>
                          <li>01</li><li>02</li><li>03</li><li>04</li><li>05</li><li>06</li><li>07</li><li>08</li><li>09</li><li>10</li><li>11</li><li>12</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                </tr>
                <tr>
                  <td valign="top"></td>
                  <td colspan="3">
                    <textarea class="projectDescription s_textarea" name="projectDescription" placeholder="项目描述"></textarea>
                    <div class="word_count">你还可以输入 <span>500</span> 字</div>
                  </td>
                </tr>

                <tr>
                  <td valign="top"></td>
                  <td colspan="3">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
              <input type="hidden" value="" class="projectId">
            </form><!--end .projectForm-->
          </div><!--end .projectEdit-->
          <div class="projectAdd pAdd">
            项目经验是用人单位衡量人才能力的重要指标哦！<br>
            来说说让你难忘的项目吧！
            <span>添加项目经验</span>
          </div><!--end .projectAdd-->
        </div><!--end #projectExperience-->

        <div class="profile_box" id="educationalBackground">
          <h2>教育背景<span>（投递简历时必填）</span></h2>
          <span class="c_add dn"></span>
          <div class="educationalShow dn">
            <form class="educationalForm borderBtm dn">
              <table>
                <tbody><tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="学校名称" name="schoolName" class="schoolName">
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="hidden" class="degree" value="" name="degree">
                    <input type="button" value="学历" class="profile_select_287 profile_select_normal select_degree">
                    <div class="box_degree boxUpDown boxUpDown_287 dn" style="display: none;">
                      <ul>
                        <li>大专</li>
                        <li>本科</li>
                        <li>硕士</li>
                        <li>博士</li>
                        <li>其他</li>
                      </ul>
                    </div>
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="专业名称" name="professionalName" class="professionalName">
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="schoolYearStart" value="" name="schoolYearStart">
                      <input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_schoolYearStart">
                      <div class="box_schoolYearStart boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="schoolYearEnd" value="" name="schoolYearEnd">
                      <input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_schoolYearEnd">
                      <div style="display: none;" class="box_schoolYearEnd  boxUpDown boxUpDown_139 dn">
                        <ul>
                          <li>2021</li>
                          <li>2020</li>
                          <li>2019</li>
                          <li>2018</li>
                          <li>2017</li>
                          <li>2016</li>
                          <li>2015</li>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                </tr>
                <tr>
                  <td></td>
                  <td colspan="3">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
              <input type="hidden" class="eduId" value="">
            </form><!--end .educationalForm-->

            <ul class="elist clearfix">
            </ul>
          </div><!--end .educationalShow-->
          <div class="educationalEdit dn">
            <form class="educationalForm">
              <table>
                <tbody><tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="学校名称" name="schoolName" class="schoolName">
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="hidden" class="degree" value="" name="degree">
                    <input type="button" value="学历" class="profile_select_287 profile_select_normal select_degree">
                    <div class="box_degree boxUpDown boxUpDown_287 dn" style="display: none;">
                      <ul>
                        <li>大专</li>
                        <li>本科</li>
                        <li>硕士</li>
                        <li>博士</li>
                        <li>其他</li>
                      </ul>
                    </div>
                  </td>
                </tr>
                <tr>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <input type="text" placeholder="专业名称" name="professionalName" class="professionalName">
                  </td>
                  <td valign="top">
                    <span class="redstar">*</span>
                  </td>
                  <td>
                    <div class="fl">
                      <input type="hidden" class="schoolYearStart" value="" name="schoolYearStart">
                      <input type="button" value="开始年份" class="profile_select_139 profile_select_normal select_schoolYearStart">
                      <div class="box_schoolYearStart boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="fl">
                      <input type="hidden" class="schoolYearEnd" value="" name="schoolYearEnd">
                      <input type="button" value="结束年份" class="profile_select_139 profile_select_normal select_schoolYearEnd">
                      <div class="box_schoolYearEnd  boxUpDown boxUpDown_139 dn" style="display: none;">
                        <ul>
                          <li>2014</li>
                          <li>2013</li>
                          <li>2012</li>
                          <li>2011</li>
                          <li>2010</li>
                          <li>2009</li>
                          <li>2008</li>
                          <li>2007</li>
                          <li>2006</li>
                          <li>2005</li>
                          <li>2004</li>
                          <li>2003</li>
                          <li>2002</li>
                          <li>2001</li>
                          <li>2000</li>
                          <li>1999</li>
                          <li>1998</li>
                          <li>1997</li>
                          <li>1996</li>
                          <li>1995</li>
                          <li>1994</li>
                          <li>1993</li>
                          <li>1992</li>
                          <li>1991</li>
                          <li>1990</li>
                          <li>1989</li>
                          <li>1988</li>
                          <li>1987</li>
                          <li>1986</li>
                          <li>1985</li>
                          <li>1984</li>
                          <li>1983</li>
                          <li>1982</li>
                          <li>1981</li>
                          <li>1980</li>
                          <li>1979</li>
                          <li>1978</li>
                          <li>1977</li>
                          <li>1976</li>
                          <li>1975</li>
                          <li>1974</li>
                          <li>1973</li>
                          <li>1972</li>
                          <li>1971</li>
                          <li>1970</li>
                        </ul>
                      </div>
                    </div>
                    <div class="clear"></div>
                  </td>
                </tr>
                <tr>
                  <td></td>
                  <td colspan="3">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
              <input type="hidden" class="eduId" value="">
            </form><!--end .educationalForm-->
          </div><!--end .educationalEdit-->
          <div class="educationalAdd pAdd">
            教育背景可以充分体现你的学习和专业能力，<br>
            且完善后才可投递简历哦！
            <span>添加教育经历</span>
          </div><!--end .educationalAdd-->
        </div><!--end #educationalBackground-->

        <div class="profile_box" id="selfDescription">
          <h2>自我描述</h2>
          <span class="c_edit dn"></span>
          <div class="descriptionShow dn">

          </div><!--end .descriptionShow-->
          <div class="descriptionEdit dn">
            <form class="descriptionForm">
              <table>
                <tbody><tr>
                  <td colspan="2">
                    <textarea class="selfDescription s_textarea" name="selfDescription" placeholder=""></textarea>
                    <div class="word_count">你还可以输入 <span>500</span> 字</div>
                  </td>
                </tr>
                <tr>
                  <td colspan="2">
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
            </form><!--end .descriptionForm-->
          </div><!--end .descriptionEdit-->
          <div class="descriptionAdd pAdd">
            描述你的性格、爱好以及吸引人的经历等，<br>
            让企业了解多元化的你！
            <span>添加自我描述</span>
          </div><!--end .descriptionAdd-->
        </div><!--end #selfDescription-->

        <div class="profile_box" id="worksShow">
          <h2>作品展示</h2>
          <span class="c_add dn"></span>
          <div class="workShow dn">
            <ul class="slist clearfix">
            </ul>
          </div><!--end .workShow-->
          <div class="workEdit dn">
            <form class="workForm">
              <table>
                <tbody><tr>
                  <td>
                    <input type="text" placeholder="请输入作品链接" name="workLink" class="workLink">
                  </td>
                </tr>
                <tr>
                  <td>
                    <textarea maxlength="100" class="workDescription s_textarea" name="workDescription" placeholder="请输入说明文字"></textarea>
                    <div class="word_count">你还可以输入 <span>100</span> 字</div>
                  </td>
                </tr>
                <tr>
                  <td>
                    <input type="submit" value="保 存" class="btn_profile_save">
                    <a class="btn_profile_cancel" href="javascript:;">取 消</a>
                  </td>
                </tr>
                </tbody></table>
              <input type="hidden" class="showId" value="">
            </form><!--end .workForm-->
          </div><!--end .workEdit-->
          <div class="workAdd pAdd">
            好作品会说话！<br>
            快来秀出你的作品打动企业吧！
            <span>添加作品展示</span>
          </div><!--end .workAdd-->
        </div><!--end #worksShow-->
        <input type="hidden" id="resumeId" value="268472">
      </div><!--end .content_l-->

</template>
<script>
    export default {}
</script>

<style>
</style>

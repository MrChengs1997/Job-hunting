<template>
  <div class="login_wrapper">
    <div class="login_header">
      <a href="h/"><img src="../style/images/logo_white.png" width="285" height="62" alt="拉勾招聘" /></a>
      <div id="cloud_s"><img src="../style/images/cloud_s.png" width="81" height="52" alt="cloud" /></div>
      <div id="cloud_m"><img src="../style/images/cloud_m.png" width="136" height="95"  alt="cloud" /></div>
    </div>

    <input type="hidden" id="resubmitToken" value="9b207beb1e014a93bc852b7ba450db27" />
    <div class="login_box">
      <form id="loginForm">
        <ul class="register_radio clearfix">
          <li>
            找工作
            <input type="radio" value="0" name="type" />
          </li>
          <li>
            招人
            <input type="radio" value="1" name="type" />
          </li>
        </ul>
        <input type="text" id="email" name="email" tabindex="1" placeholder="请输入常用邮箱地址" />
        <span class="error" style="display:none;" id="beError"></span>
        <input type="password" id="password" name="password" tabindex="2" placeholder="请输入密码" />
        <label class="fl registerJianJu" for="checkbox">
          <input type="checkbox" id="checkbox" name="checkbox" checked  class="checkbox valid" />我已阅读并同意<a href="h/privacy.html" target="_blank">《拉勾用户协议》</a>
        </label>
        <input type="submit" id="submitLogin" value="注 &nbsp; &nbsp; 册" />

        <input type="hidden" id="callback" name="callback" value=""/>
        <input type="hidden" id="authType" name="authType" value=""/>
        <input type="hidden" id="signature" name="signature" value=""/>
        <input type="hidden" id="timestamp" name="timestamp" value=""/>
      </form>
      <div class="login_right">
        <div>已有拉勾帐号</div>
        <a  href="login.html"  class="registor_now">直接登录</a>
        <div class="login_others">使用以下帐号直接登录:</div>
        <a  href="#"  target="_blank" class="icon_wb" title="使用新浪微博帐号登录"></a>
        <a  href="#"  class="icon_qq" target="_blank" title="使用腾讯QQ帐号登录" ></a>
      </div>
    </div>
    <div class="login_box_btm"></div>
  </div>
</template>

<script>
  export default {}
</script>

<style>

</style>

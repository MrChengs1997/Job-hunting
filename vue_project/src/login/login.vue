<template>
  <div >
     <div class="login_box">
          <form id="loginForm" action="index.html">
            <input type="text" id="email" name="email" value="" tabindex="1" placeholder="请输入登录邮箱地址" />
            <input type="password" id="password" name="password" tabindex="2" placeholder="请输入密码" />
            <span class="error" style="display:none;" id="beError"></span>
            <label class="fl" for="remember"><input type="checkbox" id="remember" value="" checked="checked" name="autoLogin" /> 记住我</label>
            <a href="reset.html" class="fr" target="_blank">忘记密码？</a>

            <!--<input type="submit" id="submitLogin" value="登 &nbsp; &nbsp; 录" />-->
            <a style="color:#fff;" href="index.html" class="submitLogin" title="登 &nbsp; &nbsp; 录">登 &nbsp; &nbsp; 录</a>
         </form>
          <div class="login_right">
            <div>还没有拉勾帐号？</div>
            <a @click="register"  class="registor_now">立即注册</a>
            <!--        <a  href="register.html"  class="registor_now"><router-link to="/LoginShow/register">立即注册</router-link></a>-->
            <div class="login_others">使用以下帐号直接登录:</div>
            <a  href="#"  target="_blank" class="icon_wb" title="使用新浪微博帐号登录"></a>
            <a  href="#"  class="icon_qq" target="_blank" title="使用腾讯QQ帐号登录"></a>
          </div>
      </div>
      <div class="login_box_btm"></div>
    </div>
</template>
<script>
  export default {

    props:{
      update:{//指定属性名，属性值的类型，必要性
        type:Function,
        required : true
      },
      showlogin:''
    },
    data () {
      return {
        showRegister : false
      }
    },
    methods: {
      register() {
        this.update(false)
      }
    }

  }
</script>

<style>

</style>

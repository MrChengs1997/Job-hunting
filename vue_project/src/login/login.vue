<template>
  <div >
     <div class="login_box">
          <form id="loginForm" action="index.html">
            <input type="text" id="email" @blur.prevent="checkEmail" v-model="user_email" name="email" value="" tabindex="1" placeholder="请输入登录邮箱地址" />
            <span class="error"  :style="{display:beError}" >{{beErrorMsg}}</span>
            <input type="password" id="password" v-model="user_pwd" name="password" tabindex="2" placeholder="请输入密码" />
            <span class="error" style="display:none;" id=""></span>
            <label class="fl" for="remember"><input type="checkbox" id="remember" value="" checked="checked" name="autoLogin" /> 记住我</label>
            <a href="#" class="fr" target="_blank">忘记密码？</a>

            <!--<input type="submit" id="submitLogin" value="登 &nbsp; &nbsp; 录" />-->
            <a style="color:#fff;"@click="toIndex" class="submitLogin"  title="登 &nbsp; &nbsp; 录">登 &nbsp; &nbsp; 录</a>
         </form>
          <div class="login_right">
            <div>还没有拉勾帐号？</div>
            <a @click="register"  class="registor_now">立即注册</a>
            <div class="login_others">使用以下帐号直接登录:</div>
            <a  href="#"  target="_blank" class="icon_wb" title="使用新浪微博帐号登录"></a>
            <a  href="#"  class="icon_qq" target="_blank" title="使用腾讯QQ帐号登录"></a>
          </div>
      </div>
      <div class="login_box_btm"></div>
    </div>
</template>
<script>
  //引入axios
  import  axios from  'axios'
  import strogUtil from '../util/strogUtil'

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
        showRegister : false,
        user_email:'',
        user_pwd:'',
        beError:'none',//邮箱校验
        beErrorMsg:'',//邮箱提示信息
      }
    },
    methods: {
      register() {
        this.update(false)
      },
      toIndex(){

        const  email = this.user_email.trim()
        const  pwd = this.user_pwd.trim()

        const  url = `http://localhost:8082/vuelogin?UserEmail=${email}&UserPwd=${pwd}`;
        axios({
          url:url,
          method:'GET'
        }).then(response => {

           let obj = {"resultCode":"","userAttr":"","userEmail":"","userPwd":"","userId":""}
           obj = JSON.parse(JSON.stringify(response.data))
            console.log(obj)

          if (obj.resultCode ==0){
            alert("密码错误")
          }else if (obj.resultCode ==1){
            alert("登陆成功")
            //将数据存入本地
            strogUtil.saveToken(obj)
            this.$router.push("/index")
          }
        }).catch(error=>{
          alert("服务异常，请联系管理员！")
        })
      },
      //登陆邮箱校验
      checkEmail(){
        const email = this.user_email.trim()
        //alert(email)
        //校验邮箱
        if (email === ''){
          this.beErrorMsg="请正确填写邮箱"
          this.beError='block'
          return;
        }
        if (email !== ''){
          var reg = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
          if(!reg.test(email)){
            this.beErrorMsg="请输入有效的邮箱"
            this.beError='block'
            return
          }
        }
        this.beError='none'//邮箱校验
        this.beErrorMsg=''//邮箱提示信息
      },
    }

  }
</script>

<style>

</style>

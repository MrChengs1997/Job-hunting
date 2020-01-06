<template>
  <div >
 <div class="login_box">

        <form id="loginForm" autocomplete="off" @submit.prevent="register">
          <ul class="register_radio clearfix">
            <li :class="working" @click="work" :style="{background:working}">
              找工作
              <input  v-model="user_attr"  checked="checked"  type="radio"  value="0" name="type" />
            </li>
            <li   @click="hire"  :style="{background:hiring}">
              招人
              <input v-model="user_attr" type="radio" value="1" name="type" />
            </li>
          </ul>
          <input type="text" @blur.prevent="checkEmail" v-model="user_email" id="email" name="email" tabindex="1" placeholder="请输入常用邮箱地址" />
          <span class="error"  :style="{display:beError}" id="beError">{{beErrorMsg}}</span>

          <input type="password" @blur.prevent="checkPwd" v-model="user_pwd" id="password" name="password" tabindex="2" placeholder="请输入密码(长度大于8位）"  />
          <span class="error"  :style="{display:beErrorPwd}" >{{beErrorMsgPwd}}</span>
          <label class="fl registerJianJu" for="checkbox">
            <input type="checkbox" v-model="ischecked" id="checkbox" name="checkbox" checked  class="checkbox valid" />我已阅读并同意<a href="h/privacy.html" target="_blank">《拉勾用户协议》</a>
<!--            <span class="error"  :style="{display:beErrorValid}" >{{beErrorMsgValid}}</span>-->
          </label>
          <button   type="submit" id="submitLogin" > 注册</button>
<!--          <input type="submit" id="submitLogin" value="注 &nbsp; &nbsp; 册" />-->
<!--          <a style="color:#fff;"  class="submitLogin" title="">注 &nbsp; &nbsp; 册</a>-->
        </form>
        <div class="login_right">
          <div>已有拉勾帐号</div>
          <a  @click="login"  class="registor_now">直接登录</a>
          <div class="login_others">使用以下帐号直接登录:</div>
          <a  href="#"  target="_blank" class="icon_wb" title="使用新浪微博帐号登录"></a>
          <a  href="#"  class="icon_qq" target="_blank" title="使用腾讯QQ帐号登录" ></a>
        </div>
      </div>
      <div class="login_box_btm"></div>
  </div>
</template>

<script>
  //引入axios
  import  axios from  'axios'
  //引入邮箱格式校验
  import CheckEmailUtil from '../util/CheckEmailUtil'

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
        user_attr:'',//用户属性（招聘/找工作）
        user_email:'',//用户输入邮箱
        user_pwd:'',//用户输入密码
        ischecked:'',//协议是否勾选
        working:'',//是否找工作
        hiring:'',//是否招人
        beError:'none',//邮箱校验
        beErrorMsg:'',//邮箱提示信息
        beErrorPwd:'',//密码位数判断
        beErrorMsgPwd:'',//密码位数提示
      }
    },
    methods: {
      login() {
        this.update(true)
      },
      //用户属性选择（找工作&招聘）
      work(){
        this.working='rgb(0,154,121)'
        this.hiring=''
      },
      hire(){
        this.working=''
        this.hiring='rgb(0,154,121)'
      },
      //校验邮箱&密码位数
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
      //校验密码
      checkPwd(){
        const pwd = this.user_pwd;
        if (pwd.length <8){
          this.beErrorMsgPwd="您的密码位数小于8"
          this.beErrorPwd='block'
          return;
        }
        this.beErrorPwd='none'
        this.beErrorMsgPwd=''

      },

      //进行注册按钮
      register(){
        const email = this.user_email.trim()
        const attr = this.user_attr
        const pwd = this.user_pwd.trim()
        const ischecked = this.ischecked

        //用户属性校验
        if(attr == ''){
          alert("请选择用户属性：招聘&找工作")
          return
        }

        //协议校验
        if (!ischecked){
          alert("请查看拉钩用户协议，并进行勾选同意选项")
          return
        }
        const  url = `http://localhost:8082/vueregister?UserEmail=${email}&UserPwd=${pwd}&UserAttr=${attr}`;
        axios({
          url:url,
          method:'GET'
        }).then(response => {

          const respdata = response.data

          if (respdata == 0){
            alert("请求错误！")
          }else if(respdata == 1){
            alert("注册成功,前往登陆页面")
            this.update(true)
          }else if(respdata == 2){
            alert("注册用户已经存在！")
          }
        }).catch(error=>{
          alert("服务异常，请联系管理员！")
        })


      }
    }
  }
</script>

<style>
  .attritute {
    background: rgb(0,154,121);
  }
</style>

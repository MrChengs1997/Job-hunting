<template>
  <div >
    <input type="hidden" id="hasSidebar" value="1">	<div class="content user_modifyContent">
    <dl class="c_section">
      <dt>
        <h2><em></em>修改密码</h2>
      </dt>
      <dd>
        <form >
          <table class="savePassword">
            <tbody><tr>
              <td>登录邮箱（<span style="color: red">{{userMsg}}</span>）</td>
              <td class="c7">{{obj_user.userEmail}}</td>
            </tr>
            <tr>
              <td class="label">新密码</td>
              <td><input type="password" v-model="newpwd" maxlength="16" id="newpassword" name="newpassword" style=" background-repeat: no-repeat; background-attachment: scroll; background-position: right center;"></td>
            </tr>
            <tr>
              <td class="label">确认密码</td>
              <td><input  @blur.prevent="checkpwd" type="password" v-model="surepwd" maxlength="16" id="comfirmpassword" name="comfirmpassword" style=" background-repeat: no-repeat; background-attachment: scroll; background-position: right center;">
                <span class="error"  :style="{display:diffpwd}" >{{pwdmsg}}</span>
              </td>
            </tr>
            <tr>
              <td><input type="submit" @click.prevent="toUpPwd" value="保 存"></td>
            </tr>
            </tbody></table>
        </form>
      </dd>
    </dl>
  </div>
    <div class="clear"></div>
  </div>
</template>
<script>
  //引入axios
  import  axios from  'axios'
  //引入存储】
  import strogUtil from '../../../util/strogUtil'

    export default {
      props:{
        obj_user:Object,//传递user对象
        userMsg:String,//传递职位者标识
      },
      data(){
        return{
          diffpwd:'none',//用于显示密码比对是否一致
          surepwd:'',//确认密码
          newpwd:'',//新密码
          submitsure:false,//是否可提交
          pwdmsg:'',//提示信息
        }
      },
      methods:{
        checkpwd(){//密码校验
          const  newpwd = this.newpwd.trim()
          const surepwd = this.surepwd.trim()

          if(newpwd != surepwd){
            this.diffpwd = 'block'
            this.pwdmsg = '两次输入的密码不一致'
            alert('密码不一致')
            return
          }else {
            this.submitsure = true
            this.diffpwd = 'none'
            this.pwdmsg = ''
            alert('密码一致')
            return
          }
        },
        //提交按钮
        toUpPwd(){
          if (!this.submitsure){
            this.diffpwd = 'block'
            this.pwdmsg = '请输入要修改的密码'
            return
          }

          const  email = this.obj_user.userEmail
          const  pwd = this.surepwd


          const  url = `http://localhost:8082/vueupdate/${email}/${pwd}`

          axios.put(url)
            .then(response => {
              const data = response.data
              console.log("==" + data)
              if(data !=1){
                alert("修改失败")
                return
              }
             if (data ==1){
               alert("修改成功")
               //清空本地存储诗句
               strogUtil.removeToken()
               //切换到登录页面
              this.$router.push('/LoginShow')
             }

            }).catch(error=>{
              alert("服务请求错误请联系管理员")
          })
        }
      }


    }
</script>

<style>
</style>

<template>

  <div id="container">

    <div class="user_bindSidebar">
      <dl id="user_sideBarmenu" class="user_sideBarmenu">
        <dt><h3>帐号设置</h3></dt>
        <dd><a @click="updatePerNum(1)" >帐号绑定</a></dd>
        <dd><a  @click="updatePerNum(2)">修改密码</a></dd>
      </dl>
    </div>


    <div v-if="personalNum == 1"  >
      <accountbind :obj_user="obj_user" :userMsg="userMsg"/>
    </div>
    <div v-if="personalNum == 2" >
      <updatepwd :obj_user="obj_user" :userMsg="userMsg" />
    </div>
  </div>

</template>

<script>
  import updatepwd from './personitem/updatepwd'
  import accountbind from './personitem/accountbind'
    export default {//
    props:{
      obj_user:Object,//传递user对象
      userMsg:String,//传递职位者标识
    },
      data(){
        return{
          personalNum : 1
        }
      },
      methods:{
        updatePerNum(num){//账户绑定和修改页面进行跳转
          this.personalNum = num
        }
      },
      components:{
        updatepwd,accountbind
      }
    }
</script>

<style>
  a:link {
    color:black;
    text-decoration:underline;
  }
  a:visited {
    color:#00FF00;
    text-decoration:none;
  }
  a:hover {
    color:#000000;
    text-decoration:none;
  }
  a:active {
    color:#FFFFFF;
    text-decoration:none;
  }
</style>

<template>
  <div id="header">
    <div class="wrapper">
      <a class="logo" href="h/">
        <img width="229" height="43" alt="拉勾招聘-专注互联网招聘" src="../style/images/logo.png">
      </a>
      <ul id="navheader" class="reset">
        <li><a href="#">首页</a></li>
        <li><a href="#">公司</a></li>
        <li><a target="_blank" href="">论坛</a></li>
        <li><a rel="nofollow" href="">简历管理</a></li>
        <li class="" v-if="isBoss" ><a rel="nofollow" >发布职位</a></li>
      </ul>
      <dl class="collapsible_menu">
        <dt>
          <span>您好:{{userMsg}}&nbsp;</span>
          <span class=" dn" id="noticeDot-0"></span>
          <i></i>
        </dt>
      </dl>
    </div>
  </div>
</template>

<script>
  import strogUtil from '../util/strogUtil'
  import router from 'vue-router'

  export default {
    data () {
      return {
         obj_user : {
           "resultCode":"",
           "userAttr":"",
           "userEmail":"",
           "userPwd":"",
           "userId":""
         },
        isBoss:"",//判断是否是Boss,进行显示页面的《发布职位》功能
        userMsg:'',//用于显示是求职责还是BOSS
      }
    },
    mounted () {
      this.obj_user =  strogUtil.readToken();

      if(this.obj_user.userAttr == "" || this.obj_user.resultCode == "" ||
                this.obj_user.userEmail == "" ||this.obj_user.userId == ""){
        this.$router.push("/LoginShow")
      }

      if (this.obj_user.userAttr ==1){
        this.isBoss = true;
        this.userMsg = "BOSS"
      }else {
        this.isBoss = false
        this.userMsg ="APPLICANT"
      }

      // setTimeout(() => {
      //
      // }, 1000)
    },
    methods: {
    }
  }
</script>

<style>

</style>

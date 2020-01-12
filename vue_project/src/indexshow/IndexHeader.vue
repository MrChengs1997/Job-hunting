<template>
  <div id="header">
    <div class="wrapper">
      <a class="logo" href="h/">
        <img width="229" height="43" alt="拉勾招聘-专注互联网招聘" src="../style/images/logo.png">
      </a>
      <ul id="navheader" class="reset">
        <li><a @click="updateShowListItem(1)">首页</a></li>
        <li><a @click="updateShowListItem(2)"  v-show="isBoss == true">公司</a></li>
        <li><a target="_blank"   @click="updateShowListItem(3)">个人中心</a></li>
        <li><a rel="nofollow" v-show="isBoss == false" @click="updateShowListItem(4)">简历管理</a></li>
        <li class=""  v-show="isBoss == true" @click="updateShowListItem(6)"><a rel="nofollow" >功能</a></li>
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
  import axios from 'axios'
  //PubSub库
  import PubSub from 'pubsub-js'

  export default {
    props:{
      obj_user:Object,
      isBoss:Boolean,
      userMsg:String,
      updateShowList:{
        type:Function,
        required : true
      },
      showCompany:'',//用于展示公司页面的三个选择
      updateShowCompany:{
        type:Function,
        required : true
      },
      company:Object,
      updateCompany:{
        type:Function,
        required : true
      },
    },
    data () {
      return {

      }
    },
    mounted () {
    },
    methods:{
      //用于显示主菜单之后的container
      // （首页1,公司2，个人中心3，简历4，发布职位5，功能6）
      updateShowListItem(num){
        this.updateShowList(num)

        //进行查询公司的状态
        //登录用户为boss
        if (this.obj_user.userAttr ==1){
          const  email = this.obj_user.userEmail
          const  url = `http://localhost:8082/vueisbindcompany?email=${email}`;
          axios({
            url:url,
            method:'GET'
          }).then(response => {
            const  code = response.data
            if(code ==0){
              this.updateShowCompany(1)
            }
            if (code ==1){
              this.updateShowCompany(3)
            }
            if (code ==2){

              //进行查询公司信息
              const  url = `http://localhost:8082/vuegetcompanymsg/${email}`;
              axios({
                url:url,
                method:'GET'
              }).then(response => {

                console.log(JSON.stringify(response.data) + "json")
                var obj = JSON.parse(JSON.stringify(response.data))
                console.log(obj + "obj")
                this.updateCompany(obj)
                console.log(this.company.companyWholeName + 'this')
                console.log(obj.companyWholeName + 'obj')
              }).catch(error=>{
              })

              this.updateShowCompany(2)//公司信息页面详情
            }
          }).catch(error=>{
          })
        }
      },
    }
  }
</script>

<style>

</style>

<template>

  <div>
    <IndexHeader :obj_user="obj_user" :showCompany="showCompany"
                 :updateShowList="updateShowList" :updateShowCompany="updateShowCompany"  :isBoss="isBoss"  :userMsg="userMsg"/>

    <div v-if="showList ==1">
      <IndexContainer/>
    </div>

    <div v-if="showList ==2">
        <div v-if="showCompany ==1"><company :obj_user="obj_user" :showCompany="showCompany" :updateShowCompany="updateShowCompany"/></div>
        <div v-if="showCompany ==2"><companymsg/></div>
        <div v-if="showCompany ==3"><companyAuth/></div>
    </div>

    <div v-if="showList ==3">
        <personList :obj_user="obj_user" :userMsg="userMsg" />
    </div>

    <div v-if="showList ==4">
    </div>

    <div v-if="showList ==5">
    </div>

    <div v-if="showList ==6">
    </div>

    <IndexFooter/>
  </div>
</template>
<script>
  import IndexHeader from './IndexHeader'
  import IndexContainer from './IndexContainer'
  import IndexFooter from './IndexFooter'
  import strogUtil from '../util/strogUtil'
  import company  from './features/company'
  import personList from './features/personList'
  import companymsg from './features/companymsg'
  import companyAuth from './features/companyAuth'
  import  axios from  'axios'
  import PubSub from 'pubsub-js'
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
        userMsg:'',//用于显示是APPLICANT还是BOSS
        showList:1,//用于显示主菜单之后的container（首页1,公司2，个人中心3，简历4，发布职位5，功能6）
        showCompany:'',//y用于显示公司页面（1：没有创建的时候进行创建页面，2如果已经创建好了进行显示公司信息页面）
      }
    },
    methods:{
      //container功能区域数据显示方法
      updateShowList(num){
        this.showList = num
      },
      //传递给IndexHeader组件计算showCompany值进行公司页面的显示
      updateShowCompany(num){
        this.showCompany = num
      },







  },
    mounted () {
      this.obj_user =  strogUtil.readToken();
      console.log(this.obj_user.userEmail + "===")


      //发布订阅模式：显示用户数据页面的数据
      PubSub.subscribeOnce("showCompanyMoreMsg",function () {
       // const email = this.obj_user.userEmail
        const  url = `http://localhost:8082/vuegetcompany/email=${strogUtil.readToken().userEmail}`;
        axios({
          url:url,
          method:'GET'
        }).then(response => {
          const  code = response.data
          console.log("===" + code)
        }).catch(error=>{
        })
      })


      if (this.obj_user.userAttr ==1){
        this.isBoss = true;
        this.userMsg = "BOSS"
      }else {
        this.isBoss = false
        this.userMsg ="APPLICANT"
      }



    },
    components :{
      IndexHeader,IndexContainer,IndexFooter,company,personList,companymsg,
      companyAuth
    }
  }
</script>

<style>



</style>

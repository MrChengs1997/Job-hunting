<template>

  <div>
    <IndexHeader :obj_user="obj_user" :showCompany="showCompany"
                 :updateShowList="updateShowList" :updateShowCompany="updateShowCompany"  :isBoss="isBoss"  :userMsg="userMsg"
                :company="company" :updateCompany="updateCompany"
       :resumeCode="resumeCode" :updateresumeCode="updateresumeCode"/>

    <div v-if="showList ==1">
      <IndexContainer/>
    </div>

    <div v-if="showList ==2">
        <div v-if="showCompany ==1"><company :obj_user="obj_user" :showCompany="showCompany" :updateShowCompany="updateShowCompany"/></div>
        <div v-if="showCompany ==2"><companymsg :company="company"/></div>
        <div v-if="showCompany ==3"><companyAuth/></div>
    </div>

    <div v-if="showList ==3">
        <personList :obj_user="obj_user" :userMsg="userMsg" />
    </div>

    <!--简历 -->
    <div v-if="showList ==4">
      <resumeShow :resumeCode="resumeCode"/>
    </div>

    <div v-if="showList ==6">
      <functionShow/>
    </div>

    <IndexFooter/>
  </div>
</template>
<script>
  import resume from './features/resume/resume'
  import IndexHeader from './IndexHeader'
  import IndexContainer from './IndexContainer'
  import IndexFooter from './IndexFooter'
  import strogUtil from '../util/strogUtil'
  import company  from './features/company'
  import personList from './features/personList'
  import companymsg from './features/companymsg'
  import companyAuth from './features/companyAuth'
  import createResume from './features/resume/createResume'
  import  resumeShow from  './features/resume/resumeShow'
  import  axios from  'axios'
  import PubSub from 'pubsub-js'
  import functionShow from './features/function/functionShow'
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
        company:{
          'CompanyId':'',
          'CompanyUserId':'',
          'companyWholeName':'',
          'compamyShortName':'',
          'companyWebsite':'',
          'companyLocation':'',
          'companyField':'',
          'companySize':'',
          'companyDevelopment':'',
          'companyProfile':'',
          'companyCeo':'',
        },
        resumeCode:0,//简历是否已经存在数据验证
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
      //更新company
      updateCompany(obj){
        this.company.CompanyId = obj.CompanyId
        this.company.CompanyUserId = obj.CompanyUserId
        this.company.companyWholeName = obj.companyWholeName
        this.company.compamyShortName = obj.compamyShortName
        this.company.companyWebsite = obj.companyWebsite
        this.company.companyLocation = obj.companyLocation
        this.company.companyField = obj.companyField
        this.company.companySize = obj.companySize
        this.company.companyDevelopment = obj.companyDevelopment
        this.company.companyProfile = obj.companyProfile
        this.company.companyCeo = obj.companyCeo
      },

      //更新resumeCode
      updateresumeCode(num){
        this.resumeCode = num;
      }


  },
    mounted () {
      this.obj_user =  strogUtil.readToken();
      console.log(this.obj_user.userEmail + "===")

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
      companyAuth,functionShow,resume,createResume,resumeShow
    }
  }
</script>

<style>



</style>

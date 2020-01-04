<template>
  <div id="app">

    <IndexShow/>


    <router-view/>
  </div>
</template>

<script>

  import IndexShow from './indexshow/IndexShow'
  import login from './login/login'
  import LoginShow from './login/LoginShow'
  import jianliShow from './jianli/jianliShow'
  import CompanyListShow  from './companylist/CompanyListShow'
  import JobDetailShow from './jobdetail/JobDetailShow'

//  //引入css样式
  import './style/css/style.css'
  import './style/css/external.min.css'
  import './style/css/popup.css'
  import './style/css/popup.css'

export default {
  data(){
    return{

    }
  },
  components :{
    IndexShow,login,LoginShow,jianliShow,CompanyListShow,JobDetailShow
  }
}
</script>

<style>

</style>



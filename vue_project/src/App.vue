<template>
  <div id="app">

    <LoginShow/>


    <router-view/>
  </div>
</template>

<script>

  import IndexShow from './indexshow/IndexShow'
  import login from './login/login'
  import LoginShow from './login/LoginShow'


//  //引入css样式
  import './style/css/style.css'
  import './style/css/external.min.css'
  import './style/css/popup.css'
  import './style/css/popup.css'


 // import './style/js/jquery.1.10.1.min.js'
 // import './style/js/jquery.lib.min'
 // import './style/js/ajaxfileupload'
 // import './style/js/additional-methods'
 // import './style/js/conv'



export default {
  data(){
    return{

    }
  },
  components :{
    IndexShow,login,LoginShow
  }
}
</script>

<style>

</style>



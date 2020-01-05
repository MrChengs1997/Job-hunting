<template>
      <div id="login_bg" style="width: 1366px ;height: 667px">
        <div class="login_wrapper">
          <div class="login_header">
            <a href="h/"><img src="../style/images/logo_white.png" width="285" height="62" alt="拉勾招聘" /></a>
            <div id="cloud_s"><img src="../style/images/cloud_s.png" width="81" height="52" alt="cloud" /></div>
            <div id="cloud_m"><img src="../style/images/cloud_m.png" width="136" height="95"  alt="cloud" /></div>
          </div>
          <input type="hidden" id="resubmitToken" value="9b207beb1e014a93bc852b7ba450db27" />
          <div v-if="showlogin">
            <login :showlogin="showlogin" :update="update" />
          </div>
          <div v-else>
            <register  :showlogin="showlogin" :update="update"/>
          </div>
        </div>

      </div>
</template>

<script>

  import register from './register'
  import login from './login'

  export default {
    data () {
      return {
        showlogin : true
      }
    },
    components :{
      login,register
    },
    methods:{
      update(bol){
        this.showlogin =bol
      }
    }

  }
</script>

<style>
  #login_bg{ background:#019875 url(../style/css/img/bgwall.png) center 100px no-repeat;overflow:hidden;}
</style>

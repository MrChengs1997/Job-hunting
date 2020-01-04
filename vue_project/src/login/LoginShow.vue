<template>
    <div id="login_bg">
    <login/>
    </div>
</template>

<script>

  import register from './register'
  import login from './login'

  export default {
    components :{
      login,register
    }

  }
</script>

<style>
  #login_bg{ background:#019875 url(../style/css/img/bgwall.png) center 100px no-repeat;overflow:hidden;}
</style>

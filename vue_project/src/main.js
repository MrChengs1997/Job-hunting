
import Vue from 'vue'
import App from './App'

//引入路由
import router from './router'

new Vue({
  el: '#app',
  components: { App },
  template: '<App/>',
  router
})

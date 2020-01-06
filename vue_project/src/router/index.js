/*
路由器模块
 */
//引入
//用于创建路由器的构建函数
import VueRouter from "vue-router";

//引入组件
import LoginShow from '../login/LoginShow'
import register from '../login/register'
import login from '../login/login'
//首页
import IndexShow from '../indexshow/IndexShow'

//引入vue对象
import Vue from 'vue'
//使用对象
Vue.use(VueRouter)

//暴露默认的属性，可以使用任何属性名
export default new VueRouter({
  // 多个配置项
  //由于是多个使用数组进行配置
  routes:[
    //登录页面
    {
      path:'/LoginShow',
      component :LoginShow
    },
    //注册页面
    {
      path:'/register',
      component :register
    },
    //首页
    {
      path:'/index',
      component :IndexShow
    },
    {
      path:'/LoginShow',
      component:LoginShow,
      children:[//嵌套路由会有很多使用数组
        {
          path:'register',  // '/'永远代表根目录
          component:register
        }
      ]
    }





    ,
    {
      //根路径
      path:'/',
      redirect:'/LoginShow'
    }
  ]

})

<template>
  <div >
    <input type="hidden" id="hasSidebar" value="1">	<div class="user_bindContent">

    <dl class="c_section">
      <dt>
        <h2><em></em>帐号绑定</h2>
      </dt>
      <dd id="pad">
        <ul class="use_noModify">
          <li>当前登录帐号<span style="color: red">{{userMsg}}：</span><span>{{obj_user.userEmail}}</span> </li>
          <li>绑定后，你可以同时使用以下方式登录拉勾</li>
        </ul>
        <dl class="user_thirdLogin">
          <dt><img alt="qq" src="../../../style/images/qq.png"></dt>
          <dd>已绑定QQ帐号  <span>{{obj_user.userEmail}}</span>
            <a id="cancelBind" href="javascript:;">解除绑定</a>
          </dd>
        </dl>
        <dl class="user_thirdLogin">
          <dt><img alt="weibo" src="../../../style/images/weibo.png"></dt>
          <dd><a href="h/ologin/bind/sina.html">绑定新浪微博帐号</a></dd>
        </dl>
      </dd>
    </dl>
    <input type="hidden" value="" id="s">
    <input type="hidden" value="" id="oauthid">
  </div>
    <div class="clear"></div>

  </div>
</template>

<script>
  export default {
    props:{
      obj_user:Object,//传递user对象
      userMsg:String,//传递职位者标识
    },


  }
</script>

<style>

</style>

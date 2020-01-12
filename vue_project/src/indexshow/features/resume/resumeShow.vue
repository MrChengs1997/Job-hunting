<template>
  <div id="container">
    <div class="clearfix">


      <createResume/>

      <div class="content_r">
        <div class="mycenterR" id="myInfo">
          <h2>我的信息</h2>
          <a target="_blank" href="collections.html">我收藏的职位</a>
          <br>
          <a target="_blank" href="subscribe.html">我订阅的职位</a>
        </div><!--end #myInfo-->

        <div class="mycenterR" id="myResume">
          <h2>我的附件简历
            <a title="上传附件简历" href="#uploadFile" class="inline cboxElement">上传简历</a>
          </h2>
          <div class="resumeUploadDiv">
            暂无附件简历
          </div>
        </div><!--end #myResume-->

        <div class="mycenterR" id="resumeSet">
          <h2>投递简历设置  <span>修改设置</span></h2>
          <!-- -1 (0=附件， 1=在线， 其他=未设置) -->
          <div class="noSet set0 dn">默认使用<span>附件简历</span>进行投递</div>
          <div class="noSet set1 dn">默认使用<span>在线简历</span>进行投递</div>
          <div class="noSet">暂未设置默认投递简历</div>
          <input type="hidden" class="defaultResume" value="-1">
          <form class="dn" id="resumeSetForm">
            <label><input type="radio" value="1" class="resume1" name="resume">默认使用<span>在线简历</span>进行投递</label>
            <label><input type="radio" value="0" class="resume0" name="resume">默认使用<span>附件简历</span>进行投递</label>
            <span class="setTip error"></span>
            <div class="resumeTip">设置后投递简历时将不再提醒</div>
            <input type="submit" value="保 存" class="btn_profile_save">
            <a class="btn_profile_cancel" href="javascript:;">取 消</a>
          </form>
        </div><!--end #resumeSet-->

        <div class="mycenterR" id="myShare">
          <h2>当前每日投递量：10个</h2>
          <a target="_blank" href="h/share/invite.html">邀请好友，提升投递量</a>
        </div><!--end #myShare-->


        <div class="greybg qrcode mt20">
          <img width="242" height="242" alt="拉勾微信公众号二维码" src="../../../style/images/qr_resume.png">
          <span class="c7">微信扫一扫，轻松找工作</span>
        </div>
      </div><!--end .content_r-->
    </div>
    </div>
</template>

<script>
  import createResume from './createResume'
  import resume from  './resume'
    export default {

    components:{
      createResume,resume
    }

    }
</script>

<style>
</style>

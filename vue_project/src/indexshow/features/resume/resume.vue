<template>

      <div class="content_l">
        <div class="fl" id="resume_name">
          <div class="nameShow fl">
            <h1 title="jason的简历">{{resumeObj.resumeName}} 的简历</h1>
          </div>
          <form class="fl dn" id="resumeNameForm">
            <input type="text" value="jason的简历" name="resumeName" class="nameEdit c9">
            <input type="submit" value="保存"> | <a >预览</a>
          </form>
        </div><!--end #resume_name-->
        <div class="fr c5" id="lastChangedTime">最后一次更新：<span>{{resumeObj.resumeCreateDate}} </span></div><!--end #lastChangedTime-->

        <div class="profile_box" id="basicInfo">
          <h2>基本信息</h2>
          <span class="c_edit"></span>
          <div class="basicShow">
            			<span>{{resumeObj.resumeName}} |  {{resumeObj.resumeSex}} |    {{resumeObj.resumeEduc}} |  {{resumeObj.resumeWorkYear}}<br>
            			      {{resumeObj.resumePhone}} <br>
            			</span>
            <div class="m_portrait">
              <div></div>
              <img width="120" height="120" alt="jason" src="../../../style/images/default_headpic.png">
            </div>
          </div><!--end .basicShow-->
        </div><!--end #basicInfo-->

        <div class="profile_box">
          <h2>期望工作</h2>
          <span class="c_edit dn"></span>
          <div class="expectShow dn">
            <span></span>
          </div><!--end .expectShow-->
          <div class="expectAdd pAdd" v-if="resumeObj.resumeExpectWork !=null || resumeObj.resumeExpectWork">
              {{resumeObj.resumeExpectWork}}
          </div>
          <div class="expectAdd pAdd" v-else>
            填写准确的期望工作能大大提高求职成功率哦…<br>
            快来添加期望工作吧！
            <span>添加期望工作</span>
          </div>
        </div>

        <div class="profile_box">
          <h2>工作经历</h2>
          <span class="c_edit dn"></span>
          <div class="expectShow dn">
            <span></span>
          </div><!--end .expectShow-->
          <div class="expectAdd pAdd" v-if="resumeObj.resumeWorkExper !=null || resumeObj.resumeWorkExper">
            {{resumeObj.resumeWorkExper}}
          </div>
          <div class="expectAdd pAdd" v-else>
            填写准确的工作经历能大大提高求职成功率哦…<br>
            快来添加期望工作吧！
            <span>添加期望工作</span>
          </div>
        </div>

        <div class="profile_box">
          <h2>项目经验</h2>
          <span class="c_edit dn"></span>
          <div class="expectShow dn">
            <span></span>
          </div><!--end .expectShow-->
          <div class="expectAdd pAdd" v-if="resumeObj.resumeProjectExper !=null || resumeObj.resumeProjectExper">
            {{resumeObj.resumeProjectExper}}
          </div>
          <div class="expectAdd pAdd" v-else>
            填写准确的项目经验能大大提高求职成功率哦…<br>
            快来添加期望工作吧！
            <span>添加期望工作</span>
          </div>
        </div>


        <div class="profile_box">
          <h2>作品地址</h2>
          <span class="c_edit dn"></span>
          <div class="expectShow dn">
            <span></span>
          </div><!--end .expectShow-->
          <div class="expectAdd pAdd" v-if="resumeObj.resumeWorksAddr !=null || resumeObj.resumeWorksAddr">
            {{resumeObj.resumeWorksAddr}}
          </div>
          <div class="expectAdd pAdd" v-else>
            填写准确的作品地址能大大提高求职成功率哦…<br>
            快来添加期望工作吧！
            <span>添加期望工作</span>
          </div>
        </div>

        <div class="profile_box">
          <h2>自我描述</h2>
          <span class="c_edit dn"></span>
          <div class="expectShow dn">
            <span></span>
          </div><!--end .expectShow-->
          <div class="expectAdd pAdd" v-if="resumeObj.resumeDesc !=null || resumeObj.resumeDesc">
            {{resumeObj.resumeDesc}}
          </div>
          <div class="expectAdd pAdd" v-else>
            填写准确的自我描述能大大提高求职成功率哦…<br>
            快来添加期望工作吧！
            <span>添加期望工作</span>
          </div>
        </div>




      </div><!--end .content_l-->

</template>
<script>
    export default {
      props:{
        resumeObj:Object
      }


    }
</script>

<style>
</style>

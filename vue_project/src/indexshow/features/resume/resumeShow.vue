<template>
  <div id="container">
    <div class="clearfix">
      <div v-if="resumeCode ==0">
          <createResume :updateResumeObj="updateResumeObj" :updateresumeCode="updateresumeCode"/>
        <resumeRight />
      </div>

      <div v-if="resumeCode ==1">
        <resume :resumeObj="resumeObj" :updateresumeCode="updateresumeCode"/>
        <resumeRight />
      </div>

      <div v-if="resumeCode ==3">
        <updateResume :resumeObj="resumeObj" :updateresumeCode="updateresumeCode"/>
        <resumeRight />
      </div>


    </div>
    <div id="clearfix"></div>
    </div>
</template>

<script>
  import updateResume from './updateResume'
  import createResume from './createResume'
  import resume from  './resume'
  import resumeRight from './resumeRight'
    export default {
    props:{
      resumeCode:Number,
      resumeObj:Object,//查询简历对象
      updateResumeObj:{
        type:Function,
        required : true
      } ,
      updateresumeCode:{
        type:Function,
        required : true
      },
      resumeObj:Object,//简历查询之后的对象
    },
    components:{
      createResume,resume,resumeRight,updateResume
    }

    }
</script>

<style>
  #absolutes {
    position: absolute;
    left: 30px;
    top: 20px;
  }
</style>

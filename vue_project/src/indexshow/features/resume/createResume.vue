<template>
    <div  class="content_l">
      <form id="stepForm">
        <table class="btm">
          <tbody>
          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">姓名：</td>
            <td>
              <input type="text" v-model="resumeName"  placeholder="请输入姓名" value="" name="positionAdvantage" class="input_520">
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">性别：</td>
            <td>
              <select  class="select selectr_380"  v-model="resumeSex">
                <option value="男">男</option>
                <option value="女" >女</option>
              </select>
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">学历：</td>
            <td>
              <select  class="select selectr_380" v-model="resumeEduc" >
                <option value="无">无</option>
                <option value="大专">大专</option>
                <option value="本科">本科</option>
                <option value="硕士">硕士</option>
                <option value="博士">博士</option>
              </select>
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">联系方式：</td>
            <td>
              <input type="text" v-model="resumePhone"  placeholder="您的联系方式" value="" name="positionAdvantage" class="input_520">
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">工作年限：</td>
            <td>
              <select  class="select selectr_380"  v-model="resumeWorkYear">
                <option value="应届毕业生">应届毕业生</option>
                <option value="1年以下">1年以下</option>
                <option value="1-3年">1-3年</option>
                <option value="3-5年">3-5年</option>
                <option value="5-10年">5-10年</option>
                <option value="10年以上">10年以上</option>
              </select>
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">期望工作：</td>
            <td>
              <input type="text" v-model="resumeExpectWork" placeholder="您期望的工作" value="" name="positionAdvantage" class="input_520">
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">工作经历：</td>
            <td>
              <input type="text" v-model='resumeWorkExper'  placeholder="您的工作经历" value="" name="positionAdvantage" class="input_520">
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">项目经验：</td>
            <td>
              <input type="text" v-model="resumeProjectExper"  placeholder="您的项目经验" value="" name="positionAdvantage" class="input_520">
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">作品地址：</td>
            <td>
              <input type="text" v-model="resumeWorksAddr"  placeholder="您的作品地址" value="" name="positionAdvantage" class="input_520">
            </td>
          </tr>

          <tr>
            <td width="25"><span class="redstar">*</span></td>
            <td width="85">自我描述：</td>
            <td>
              <input type="text" v-model="resumeDesc"  placeholder="您的自我描述对简历的筛选很重要哦！" value="" name="positionAdvantage" class="input_520">
            </td>
          </tr>
          <tr>
            <td width="25"></td>
            <td colspan="2">
              <input type="submit" @click.prevent="addResume" value="添加简历" id="stepBtn1" class="btn_big fr">
            </td>
          </tr>
          </tbody>
        </table>
      </form>
    </div>
</template>

<script>
    import strogUtil from '../../../util/strogUtil'
    import axios from 'axios'

    export default {
      props:{
        updateResumeObj:{
          type:Function,
          required : true
        },
        updateresumeCode:{
          type:Function,
          required : true
        },
      },
      data(){
        return{
          resumeName:'',
          resumeSex:'',
          resumeEduc:'',
          resumeExpectWork:'',
          resumeWorkExper:'',
          resumeProjectExper:'',
          resumeWorksAddr:'',
          resumePhone:'',
          resumeDesc:'',
          resumeWorkYear:''
        }
      },
      methods:{
        addResume(){
          let param = new URLSearchParams()
          param.append('resumeName', this.resumeName)
          param.append('resumeSex', this.resumeSex)
          param.append('resumeEduc', this.resumeEduc)
          param.append('resumeExpectWork', this.resumeExpectWork)
          param.append('resumeWorkExper', this.resumeWorkExper)
          param.append('resumeProjectExper', this.resumeProjectExper)
          param.append('resumeWorksAddr', this.resumeWorksAddr)
          param.append('resumePhone', this.resumePhone)
          param.append('resumeDesc', this.resumeDesc)
          param.append('resumeWorkYear', this.resumeWorkYear)


          const userId = strogUtil.readToken().userId
          const  url = `http://localhost:8082/vueaddResume/${userId}`;
          axios({
            url:url,
            method:'POST',
            data:param
          }).then(response => {
            const  code = response.data

            if(code  ==1){//标记插入成功

              this.updateresumeCode(1)
                          //需要进行查询简历数据
                         const userId= strogUtil.readToken().userId
                          axios({
                            url:`http://localhost:8082/vuegetResumeDetail/${userId}`,
                            method:'GET'
                          }).then(response => {
                            const  codeObj = response.data
                            this.updateResumeObj(codeObj)

                          }).catch(error=>{
                          })


            }

          })



        }
      }


    }
</script>

<style>
  .inputtest{
    width:200px; height:20px
  }

</style>

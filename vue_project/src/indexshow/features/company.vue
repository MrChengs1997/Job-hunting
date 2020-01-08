<template>
  <div id="container">

    <div style="" id="stepTip">
      <a></a>
      <img width="803" height="59" src="../../style/images/tiponce.jpg">
    </div>
    <div class="content_mid">
      <dl class="c_section c_section_mid">
        <dt>
          <h2><em></em>填写公司信息</h2>
        </dt>
        <dd>
          <form id="stepForm">
            <div class="c_text_1">基本信息为必填项，是求职者加速了解公司的窗口，认真填写吧！</div>

            <h3>公司全称</h3>
            <input type="text" v-model="com_whole_name" placeholder="请输入公司全称，如:拉勾招聘" value="" name="name"  class="valid">
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>

            <h3>公司简称</h3> <!--非必填-->
            <input type="text" v-model="com_short_name" placeholder="请输入公司简称，如:拉勾" value="" name="name"  class="valid">
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>


            <h3>公司网址</h3>
            <input type="text" v-model="com_website" placeholder="请输入公司网址" value="" name="website" id="website">
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>

            <h3>公司CEO</h3>
            <input type="text" v-model="com_ceo" placeholder="请输入公司简称，如:拉勾" value="" name="name"  class="valid">
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>

            <h3>所在城市</h3>
            <input type="text" v-model="com_location" placeholder="请输入工作城市，如：北京" name="city" id="city">
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>

            <h3>行业领域</h3>
            <div>
              <select id="select_industry" class="select" v-model="com_field">
                <option value="移动互联网">移动互联网</option>
                <option value="电子商务">电子商务</option>
                <option value="社交">社交</option>
                <option value="O2O">O2O</option>
                <option value="教育">教育</option>
                <option value="文化艺术">文化艺术</option>
                <option value="游戏">游戏</option>
                <option value="在线旅游">在线旅游</option>
                <option value="金融互联网">金融互联网</option>
                <option value="健康医疗">健康医疗</option>
                <option value="生活服务">生活服务</option>
                <option value="硬件">硬件</option>
                <option value="搜索">搜索</option>
                <option value="安全">安全</option>
                <option value="运动体育">运动体育</option>
                <option value="云计算\大数据">云计算\大数据</option>
                <option value="移动广告">移动广告</option>
                <option value="社会化营销">社会化营销</option>
                <option value="视频多媒体">视频多媒体</option>
                <option value="媒体">媒体</option>
                <option value="视频多媒体">视频多媒体</option>
                <option value="智能家居">智能家居</option>
                <option value="分类信息">分类信息</option>
                <option value="智能电视">智能电视</option>
                <option value="招聘">招聘</option>
              </select>
            </div>
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>


            <h3>公司规模</h3>
            <div>
              <select id="select_industry1" class="select" v-model="com_size">
                <option value="少于15人">少于15人</option>
                <option value="15-50人">15-50人</option>
                <option value="50-150人">50-150人</option>
                <option value="150-500人">150-500人</option>
                <option value="500-2000人">500-2000人</option>
                <option value="2000人以上">2000人以上</option>
              </select>
            </div>
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>

            <h3>发展阶段</h3>
            <div>
              <select  class="select" v-model="com_development">
                <option value="天使轮">天使轮</option>
                <option value="A轮">A轮</option>
                <option value="B轮">B轮</option>
                <option value="C轮">C轮</option>
                <option value="D轮及以上">D轮及以上</option>
                <option value="上市公司">上市公司</option>
              </select>
              <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>
            </div>

            <h3>公司介绍</h3>
            <input type="text" v-model="com_profile" placeholder="公司亮点，如公司愿景、领导团队等，限50字" maxlength="50" name="temptation" id="temptation">
            <span :style="{display:isNone}" class="error" >{{isNoneMsg}}</span>
            <input type="submit" @click.prevent="submitCompany" value="保存信息" id="stepBtn1" class="btn_big fr">
          </form>
        </dd>
      </dl>
    </div>
    <div class="clear"></div>
  </div>
</template>

<script>
  import '../../style/css/style.css'
  import '../../style/css/external.min.css'
  import '../../style/css/popup.css'
  import '../../style/css/popup.css'
  import  axios from  'axios'
    export default {
      props:{
        obj_user:Object,
        showCompany:'',
        updateShowCompany:{
          type:Function,
          require:true
        }
      },
      data(){
        return{
          com_whole_name:'',
          com_short_name:'',
          com_profile:'',
          com_development:'',
          com_size:'',
          com_field:'',
          com_location:'',
          com_ceo:'',
          com_website:'',
          isNone:'none',
          isNoneMsg:'',
        }
      },
      methods:{
        submitCompany(){
          //清理数据】
          this.isNone = 'none'
          this.isNoneMsg = ''

          const whole_name = this.com_whole_name.trim()
          const short_name = this.com_short_name.trim()
          const profile = this.com_profile.trim()
          const development = this.com_development.trim()
          const size = this.com_size.trim()
          const field = this.com_field.trim()
          const location = this.com_location.trim()
          const ceo = this.com_ceo.trim()
          const website = this.com_website.trim()

          console.log(whole_name)

          if( whole_name == "" ){
             this.isNone = 'block'
             this.isNoneMsg = '请填写公司全称'
             return
          }
          if( short_name == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司简称'
            return
          }
          if( profile == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司公司介绍'
            return
          }
          if( development == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司公司发展阶段'
            return
          }
          if( size == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司公司规模'
            return
          }
          if( field == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司业务领域'
            return
          }
          if( location == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司业地址'
            return
          }
          if( ceo == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司CEO'
            return
          }
          if( website == "" ){
            this.isNone = 'block'
            this.isNoneMsg = '请填写公司官网'
            return
          }
          const email = this.obj_user.userEmail
          const  url = `http://localhost:8082/vueaddcompany/${email}`;
          axios({
            url:url,
            method:'POST',
            data:{
              companyWholeName:whole_name,
              companyWholeName:short_name,
              compamyShortName:short_name,
              companyWebsite:website,
              companyLocation:location,
              companyField:field,
              companySize:size,
              companyDevelopment:development,
              companyProfile:profile,
              companyCeo:ceo
            }
          }).then(response => {
            const  code = response.data

            if(code ==1){
              this.updateShowCompany(3)
            }
          })
        },
      }


    }
</script>

<style>
</style>

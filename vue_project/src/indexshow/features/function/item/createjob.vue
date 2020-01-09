<template>
    <div>
      <dl class="company_center_content">
        <dt>
          <h1>
            <em></em>
            发布新职位
          </h1>
        </dt>
        <dd>
          <form id="stepForm">
            <table class="btm">
              <tbody><tr>
                <td width="25"><span class="redstar">*</span></td>
                <td width="85">职位类别</td>
                <td>
                  <input type="text" v-model="job_category" placeholder="请选择职位类别，如：Java开发" value="" name="positionName" id="select_category">
                </td>
              </tr>
              <tr>
                <td><span class="redstar">*</span></td>
                <td>职位名称</td>
                <td>
                  <input type="text" v-model="job_name" placeholder="请输入职位名称，如：产品经理" value="" name="positionName" id="positionName">
                </td>
              </tr>
              <tr>
                <td></td>
                <td>所属部门</td>
                <td>
                  <input type="text" v-model="job_dept" placeholder="请输入所属部门" value="" name="department" id="department">
                </td>
              </tr>
              </tbody></table>
            <table class="btm">
              <tbody><tr>
                <td width="25"><span class="redstar">*</span></td>
                <td width="85">工作性质</td>
                <td>
                  <select v-model="job_nature"  class="select selectr_380" >
                    <option value="全职">全职</option>
                    <option value="兼职">兼职</option>
                    <option value="实习">实习</option>
                  </select>
                </td>
              </tr>
              <tr>
                <td><span class="redstar">*</span></td>
                <td>月薪范围</td>
                <td>
                  <div class="salary_range">
                    <div>
                      <input type="text" v-model="job_salary_min" placeholder="最低月薪" value="" id="salaryMin" name="salaryMin">
                      <span>k</span>
                    </div>
                    <div>
                      <input type="text" v-model="job_salary_max" placeholder="最高月薪" value="" id="salaryMax" name="salaryMax">
                      <span>k</span>
                    </div>
                  </div>
                </td>
              </tr>
              <tr>
                <td><span class="redstar">*</span></td>
                <td>工作城市</td>
                <td>
                  <input type="text" v-model="job_city" placeholder="请输入工作城市，如：北京" value="上海" name="workAddress" id="workAddress">

                </td>
              </tr>
              </tbody></table>
            <table class="btm">
              <tbody><tr>
                <td width="25"><span class="redstar">*</span></td>
                <td width="85">工作经验</td>
                <td>
                  <select id="select_experience" class="select selectr_380" v-model="job_exper">
                    <option value="不限">不限</option>
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
                <td><span class="redstar">*</span></td>
                <td>学历要求</td>
                <td>
                  <select id="select_education" class="select selectr_380" v-model="job_educ">
                    <option value="不限">不限</option>
                    <option value="大专">大专</option>
                    <option value="社交">本科</option>
                    <option value="硕士">硕士</option>
                    <option value="博士">博士</option>
                  </select>
                </td>
              </tr>
              </tbody>
            </table>
            <table class="btm">
              <tbody><tr>
                <td width="25"><span class="redstar">*</span></td>
                <td width="85">职位描述</td>
                <td>
                  <input type="text" v-model="job_desc" placeholder="简述任职要求" value="" name="positionAdvantage" class="input_520" id="positionAdvantage">
                </td>
              </tr>
              <tr>
                <td><span class="redstar">*</span></td>
                <td>工作地址</td>
                <td>
                  <input type="text" v-model="job_address" placeholder="请输入详细的工作地址" value="" name="positionAddress" class="input_520" id="positionAddress">
                </td>
              </tr>
              </tbody></table>
            <table>
              <tbody>
              <tr>
                <td width="25"></td>
                <td colspan="2">
                  <span class="error"  :style="{display:disMsg}" >{{disDesc}}</span>
                  <input type="submit" @click.prevent="addjob" value="发布" id="stepBtn1" class="btn_big fr">
                </td>
              </tr>
              </tbody></table>
          </form>
        </dd>
      </dl>
    </div>
</template>

<script>
  import axios from 'axios'
import strogUtil from '../../../../util/strogUtil'
  export default {
    data(){
      return{
        job_category:'',//职位类别
        job_name:'',//职位名称
        job_dept:'',//部门
        job_nature:'',//性质
        job_salary_min:'',//低薪资
        job_salary_max:'',//高新
        job_city:'',
        job_exper:'',
        job_educ:'',
        job_desc:'',
        job_address:'',
        disMsg:'none',
        disDesc:''
      }
    },
    methods:{
      addjob(){
        //首先另错误提示隐身
        this.disDesc=''
        this.disMsg='display'

        const catagory = this.job_category.trim()
        const name = this.job_name.trim()
        const dept = this.job_dept.trim()
        const nature = this.job_nature.trim()
        const salarymin = this.job_salary_min.trim()
        const salarymax = this.job_salary_max.trim()
        const city = this.job_city.trim()
        const exper = this.job_exper.trim()
        const educ = this.job_educ.trim()
        const address = this.job_address.trim()
        const desc = this.job_desc.trim()

        if(catagory === ''){
          this.disDesc='职位类别不能为空'
          this.disMsg='block'
          return
        }
        if(name == null || name == ''){
          this.disDesc='职位名称不能为空'
          this.disMsg='block'
          return
        }
        if(dept == null || dept == ''){
          this.disDesc='部门不能为空'
          this.disMsg='block'
          return
        }
        if(nature == null || nature == ''){
          this.disDesc='工作性质不能为空'
          this.disMsg='block'
          return
        }
        if(salarymin == null || salarymin == ''){
          this.disDesc='最低薪资不能为空'
          this.disMsg='block'
          return
        }
        if(salarymax == null || salarymax == ''){
          this.disDesc='最高薪资不能为空'
          this.disMsg='block'
          return
        }
        if(city == null || city == ''){
          this.disDesc='工作城市不能为空'
          this.disMsg='block'
          return
        }
        if(exper == null || exper == ''){
          this.disDesc='工作经验不能为空'
          this.disMsg='block'
          return
        }
        if(educ == null || educ == ''){
          this.disDesc='学历要求不能为空'
          this.disMsg='block'
          return
        }
        if(address == null || address == ''){
          this.disDesc='工作地址不能为空'
          this.disMsg='block'
          return
        }
        if(desc == null || desc == ''){
          this.disDesc='详细描述不能为空'
          this.disMsg='block'
          return
        }

        let param = new URLSearchParams()
        param.append('JobCategory', catagory)
        param.append('JobName', name)
        param.append('JobDept', dept)
        param.append('JobNature', nature)
        param.append('JobSalaryMin', salarymin)
        param.append('JobSalaryMax', salarymax)
        param.append('JobCity', city)
        param.append('JobExper', exper)
        param.append('JobEduc', educ)
        param.append('JobAddress', address)
        param.append('JobDesc', desc)

        const email = strogUtil.readToken().userEmail
        const  url = `http://localhost:8082/vueaddjob/${email}`;
        axios({
          url:url,
          method:'POST',
          data:param
        }).then(response => {
          const  code = response.data
          if(code ==1){

           this.job_category=''
            this.job_name=''
           this.job_dept=''
           this.job_nature=''
            this.job_salary_min=''
            this.job_salary_max=''
            this.job_city=''
            this.job_exper=''
            this.job_educ=''
            this.job_address=''
            this.job_desc=''

            alert('添加JOB成功')
          }
        })

      }

    }
  }
</script>

<style>

</style>

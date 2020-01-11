package com.consumer.design.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import core.design.exception.ParameterException;
import core.design.exception.UtilParmeter;
import core.design.pojo.company.CompanyDetailDto;
import core.design.pojo.job.JobDetailDto;
import core.design.pojo.user.UserDetailDto;
import core.design.util.StatusCode;
import core.design.util.URLUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/*
 *  MrChengs
 *  2020/1/9
 *  添加工作
 */
@CrossOrigin
@RestController
public class VuejobDetailController {

    @Autowired
    RestTemplate restTemplate;


    //添加job表信息
    @PostMapping(value = "/vueaddjob/{email}",produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public  Integer addJob(JobDetailDto jobDetailDto, @PathVariable("email")String email){
        checkJobParamer(jobDetailDto);

       Integer RES_CODE = 0;

        try {
            //获取用户id
            String  baseUrl = "http://PROVIDER/vueusermsg";
            MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
            params.add("email",email);
            //对象
            ResponseEntity<String> userMsg = restTemplate.getForEntity(URLUtil.getURI(baseUrl,params), String.class);

            //json转换为对象
            UserDetailDto userDetailDtoMsg = JSON.parseObject(userMsg.getBody(), UserDetailDto.class);

            //获取数据companyId
            String companyDtoJson = restTemplate.getForObject("http://PROVIDER/vuegetcompanymsg/" + email, String.class);
            CompanyDetailDto  companyDetailDto= JSON.parseObject(companyDtoJson, CompanyDetailDto.class);

            //设置数据的user_id
           if (userDetailDtoMsg != null){
               if (userDetailDtoMsg.getUserId() != null){
                   if (companyDetailDto != null){
                       if (companyDetailDto.getCompanyId() !=null){
                           jobDetailDto.setJobUserId(userDetailDtoMsg.getUserId());
                           jobDetailDto.setJobComId(companyDetailDto.getCompanyId());
                           //新增接口
                           ResponseEntity<Integer> addComCode = restTemplate.postForEntity("http://PROVIDER/vueaddjob", jobDetailDto, Integer.class);

                           RES_CODE = addComCode.getBody();
                       }
                   }
               }
           }
        }catch (Exception r){
        }
        return RES_CODE;
    }

    //查询Jbob表
    //
    @GetMapping("/vuegetjobdetail/{userId}/{code}")
    List<JobDetailDto> getJobDetailByUserId(@PathVariable("userId")String userId,
                                            @PathVariable("code")Integer code){

        if(userId == null){
            throw new ParameterException(UtilParmeter.User_ID,UtilParmeter.User_ID_DESC);
        }
        if(code == null){
            throw new ParameterException(UtilParmeter.CODE_CODE,UtilParmeter.CODE_DESC);
        }

        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            //调用查询接口
            String baseUrl = "http://PROVIDER/vuegetjobDetail/"+userId;
            ResponseEntity<String>  JobMsg =
                    restTemplate.getForEntity(baseUrl, String.class);

            if (JobMsg.getBody() != null){
                List<JobDetailDto> jobDetailDtos1 = JSONArray.parseArray(JobMsg.getBody(), JobDetailDto.class);
                //code状态为1查询有效职位
                //code状态为0查询下线职位
                if (jobDetailDtos1.size() > 0&& jobDetailDtos1 != null){
                    for (JobDetailDto jobDetailDto :jobDetailDtos1){
                        if (jobDetailDto.getJobExist() ==code){
                            jobDetailDtos.add(jobDetailDto);
                        }
                    }
                }
            }
        }catch (Exception e){
        }
        return  jobDetailDtos;
    }


    //根据jobID进行删除指定的JobDetail数据（实质是将状态为变为1）
    //删除实质将数据字段变为3
    @GetMapping("/vuedeletejobdetail/{JobId}/{code}")
    public  Integer deleteIobDetailByJobId(@PathVariable("JobId")String JobId,@PathVariable("code")String code){

        Integer RES_CODE = 0;
        try {
            Integer del_code =
                    restTemplate.getForObject("http://PROVIDER/vuedeletejobdetail/" + JobId + "/" + code, Integer.class);
            if (del_code == 1){
                RES_CODE = 1;
            }
        }catch (Exception e){

        }
        return  RES_CODE;
    }


    public  void checkJobParamer(JobDetailDto jobDetailDto){
        if (jobDetailDto.getJobAddress() ==null){
            throw new ParameterException(UtilParmeter.JOB_ADDRESS_CODE,UtilParmeter.JOB_ADDRESS_DESC);
        }
        if (jobDetailDto.getJobCategory() ==null){
            throw new ParameterException(UtilParmeter.JOB_CATA_CODE,UtilParmeter.JOB_CATA_DESC);
        }
        if (jobDetailDto.getJobCity() ==null){
            throw new ParameterException(UtilParmeter.JOB_CITY_CODE,UtilParmeter.JOB_CITY_DESC);
        }
        if (jobDetailDto.getJobDept() ==null){
            throw new ParameterException(UtilParmeter.JOB_DEPT_CODE,UtilParmeter.JOB_DEPT_DESC);
        }
        if (jobDetailDto.getJobDesc() ==null){
            throw new ParameterException(UtilParmeter.JOB_DESC_CODE,UtilParmeter.JOB_DESC_DESC);
        }
        if (jobDetailDto.getJobEduc() ==null){
            throw new ParameterException(UtilParmeter.JOB_EDU_CODE,UtilParmeter.JOB_EDU_DESC);
        }
        if (jobDetailDto.getJobExper() ==null){
            throw new ParameterException(UtilParmeter.JOB_EXP_CODE,UtilParmeter.JOB_EXP_DESC);
        }
        if (jobDetailDto.getJobName() ==null){
            throw new ParameterException(UtilParmeter.JOB_NAME_CODE,UtilParmeter.JOB_Name_DESC);
        }
        if (jobDetailDto.getJobNature() ==null){
            throw new ParameterException(UtilParmeter.JOB_NAT_CODE,UtilParmeter.JOB_NAT_DESC);
        }
        if (jobDetailDto.getJobSalaryMax() ==null){
            throw new ParameterException(UtilParmeter.JOB_S_MAX_CODE,UtilParmeter.JOB_S_MAX_DESC);
        }
        if (jobDetailDto.getJobSalaryMin() ==null){
            throw new ParameterException(UtilParmeter.JOB_S_MIN_CODE,UtilParmeter.JOB_S_MIN_DESC);
        }


    }




}

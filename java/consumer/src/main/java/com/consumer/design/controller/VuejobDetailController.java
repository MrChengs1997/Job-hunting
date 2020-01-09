package com.consumer.design.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import core.design.exception.ParameterException;
import core.design.exception.UtilParmeter;
import core.design.pojo.company.CompanyDetailDto;
import core.design.pojo.job.JobDetailDto;
import core.design.pojo.user.UserDetailDto;
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
//    @GetMapping("/vuegetjobdetail/{userId}/{code}")
//    List<JobDetailDto> getJobDetailByUserId(@PathVariable("userId")String userId,
//                                            @PathVariable("code")String code){

    @GetMapping("/vuegetjobdetail")
    List<JobDetailDto> getJobDetailByUserId(String userId, String code){
        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            //调用查询接口
            String baseUrl = "http://PROVIDER/vuegetjobDetail/"+userId;
            ResponseEntity<String>  JobMsg =
                    restTemplate.getForEntity(baseUrl, String.class);
            System.out.println(JobMsg.getBody());

            jobDetailDtos = JSONArray.parseArray(JobMsg.getBody(),JobDetailDto.class);

        }catch (Exception e){

        }
        return  jobDetailDtos;
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

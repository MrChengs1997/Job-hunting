package com.consumer.design.controller;

import com.alibaba.fastjson.JSON;
import core.design.pojo.resume.ResumeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;


/*
 *  MrChengs
 *  2020/1/13
 *  简历相关操作
 */
@CrossOrigin
@RestController
public class VueResumeController {

    @Autowired
    RestTemplate restTemplate;


    //根据用户id进行添加简历数据
    //添加job表信息
    @PostMapping(value = "/vueaddResume/{UserId}",produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public  Integer addJob(ResumeDto resumeDto, @PathVariable("UserId")Integer UserId){
        Integer ResultCode = 0;
        resumeDto.setResumeUserId(UserId);
        resumeDto.setResumeCreateDate(new Date());
        try {
            ResponseEntity<Integer> addResumneBody = restTemplate.postForEntity("http://PROVIDER/vueaddResume", resumeDto, Integer.class);
           int a =0;
            if (addResumneBody.getBody() == 1){
                ResultCode =1;
            }
        }catch (Exception e){
        }
        return  ResultCode;
    }


    //根据用户id查询是否已经创建简历
    //已经创建了返回1
    //未创建简历返回0
    @GetMapping("/vuegetResumeCode/{userId}")
    public Integer getJobDetailByUserIdCode(@PathVariable("userId")String userId){
        Integer ResultCode = 0;
        try {
            Integer code  = restTemplate.getForObject("http://PROVIDER/vuegetResumeCode/" + userId, Integer.class);
            if (code == 1){
                ResultCode = 1;
            }
        }catch (Exception e){
        }
        return ResultCode;
    }


    @GetMapping("/vuegetResumeDetail/{userId}")
    public ResumeDto getJobDetailByUserId(@PathVariable("userId")String userId){
        ResumeDto resumeDto = null;
        try {
            String resumeJson = restTemplate.getForObject("http://PROVIDER/vuegetResumeDetail/" + userId, String.class);
            resumeDto= JSON.parseObject(resumeJson, ResumeDto.class);
        }catch (Exception e){

        }
        return resumeDto;
    }





    }

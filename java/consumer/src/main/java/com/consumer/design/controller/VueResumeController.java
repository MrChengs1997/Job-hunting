package com.consumer.design.controller;

import core.design.pojo.job.JobDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    //根据用户id查询是否已经创建简历
    //已经创建了返回1
    //未创建简历返回0
    @GetMapping("/vuegetResumeCode/{userId}")
    public Integer getJobDetailByUserId(@PathVariable("userId")String userId){
        Integer ResultCode = 0;
        try {
            Integer code  = restTemplate.getForObject("http://PROVIDER/vuegetResumeCode/" + userId, Integer.class);
            if (code == 1){
                ResultCode = 1;
            }
        }catch (Exception e){
        }
        return 0;
    }





    }

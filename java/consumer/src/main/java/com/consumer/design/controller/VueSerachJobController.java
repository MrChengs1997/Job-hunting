package com.consumer.design.controller;


import com.alibaba.fastjson.JSONObject;
import core.design.exception.ParameterException;
import core.design.exception.UtilParmeter;
import core.design.pojo.job.JobDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/*
 *  MrChengs
 *  2020/1/12
 *  job工作查询
 */

@CrossOrigin
@RestController
public class VueSerachJobController {
    @Autowired
    RestTemplate restTemplate;


    //查询最新的数据仅限20条数据
    @GetMapping("/getNewJobDetail")
    public List<JobDetailDto> getNewJobDetail(){

        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            String JobDetailDtoJson = restTemplate.getForObject("http://PROVIDER/getNewJobDetail", String.class);

            if (JobDetailDtoJson != null){
                jobDetailDtos = JSONObject.parseArray(JobDetailDtoJson, JobDetailDto.class);
            }
        }catch ( Exception e){
        }
        return  jobDetailDtos;
    }



    //查询热门的数据仅限20条数据
    @GetMapping("/getHotJobDetail")
    public List<JobDetailDto> getHotJobDetail(){

        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            String JobDetailDtoJson = restTemplate.getForObject("http://PROVIDER/getHotJobDetail", String.class);

            if (JobDetailDtoJson != null){
                jobDetailDtos = JSONObject.parseArray(JobDetailDtoJson, JobDetailDto.class);
            }
        }catch ( Exception e){
        }
        return  jobDetailDtos;
    }


    //查询热门的数据仅限20条数据
    @GetMapping("/getJobDetailByName/{serachName}")
    public List<JobDetailDto> getJobDetailByName(@PathVariable("serachName")String serachName){
        if (serachName == null) {
            throw new ParameterException(UtilParmeter.SER_CODE,UtilParmeter.SER_DESC);
        }

        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            String JobDetailDtoJson = restTemplate.getForObject("http://PROVIDER/getJobDetailByName/"+serachName, String.class);

            if (JobDetailDtoJson != null){
                jobDetailDtos = JSONObject.parseArray(JobDetailDtoJson, JobDetailDto.class);
            }
        }catch ( Exception e){
        }
        return  jobDetailDtos;
    }

}

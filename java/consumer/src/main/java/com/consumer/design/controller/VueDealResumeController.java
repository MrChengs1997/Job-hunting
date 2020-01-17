package com.consumer.design.controller;

import com.alibaba.fastjson.JSONObject;
import core.design.pojo.ResumeListDto;
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
 *  2020/1/17
 *  boss处理简历接口
 */
@CrossOrigin
@RestController
public class VueDealResumeController {

    @Autowired
    RestTemplate restTemplate;


    //查询为处理的简历列表
    @GetMapping("/vuegetAllResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllResumeByBossUserId(@PathVariable("userId")Integer userId){
        List<ResumeListDto> resumeListDtos = null;
        try {
            String ResumeListDtoJson = restTemplate.getForObject("http://PROVIDER/vuegetAllResumeBuBossId/" + userId, String.class);
            if (ResumeListDtoJson != null){
                resumeListDtos= JSONObject.parseArray(ResumeListDtoJson, ResumeListDto.class);
            }
        }catch (Exception e){
        }
        return null;
    }



}

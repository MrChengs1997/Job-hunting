package com.consumer.design.controller;

import com.alibaba.fastjson.JSONObject;
import core.design.exception.ParameterException;
import core.design.exception.UtilParmeter;
import core.design.pojo.ResumeListDto;
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


    //查询未处理的简历列表
    @GetMapping("/vuegetAllResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllResumeByBossUserId(@PathVariable("userId")Integer userId){
        checkUserUd(userId);
        List<ResumeListDto> resumeListDtos = null;
        try {
            String ResumeListDtoJson = restTemplate.getForObject("http://PROVIDER/vuegetAllResumeBuBossId/" + userId, String.class);
            if (ResumeListDtoJson != null){
                resumeListDtos= JSONObject.parseArray(ResumeListDtoJson, ResumeListDto.class);
            }
        }catch (Exception e){
        }
        return resumeListDtos;
    }

    //处理合格简历进行修改数据
    @GetMapping("/vuequalifiedResume/{userId}/{jobId}")
    public Integer qualifiedResume(@PathVariable("userId")Integer userId,
                                   @PathVariable("jobId")Integer jobId){//userId:投递用户id   jobId:投递工作的id
        checkUserUd(userId);
        if (jobId ==null ){
            throw new ParameterException(UtilParmeter.JOB_ID_CODE,UtilParmeter.JOB_ID_DESC);
        }
        //返回状态码
        //0：失败
        //1:成功
        Integer RES_CODE = 0;
        try {
            Integer res_code  =
                    restTemplate.getForObject("http://PROVIDER/vuequalifiedResume/" + userId +"/" + jobId, Integer.class);
            if (res_code != null){
                RES_CODE = res_code;
            }
        }catch (Exception e){
        }
        return  RES_CODE;
    }

    //处理不合格简历进行修改数据
    @GetMapping("/vuedisqualifiedResume/{userId}/{jobId}")
    public Integer disqualifiedResume(@PathVariable("userId")Integer userId,
                                   @PathVariable("jobId")Integer jobId){//userId:投递用户id   jobId:投递工作的id
        checkUserUd(userId);
        if (jobId ==null ){
            throw new ParameterException(UtilParmeter.JOB_ID_CODE,UtilParmeter.JOB_ID_DESC);
        }
        //返回状态码
        //0：失败
        //1:成功
        Integer RES_CODE = 0;
        try {
            Integer res_code  =
                    restTemplate.getForObject("http://PROVIDER/vuedisqualifiedResume/" + userId +"/" + jobId, Integer.class);
            if (res_code != null){
                RES_CODE = res_code;
            }
        }catch (Exception e){
        }
        return  RES_CODE;
    }


    //删除已经合格的简历记录
    @GetMapping("/vuedeleteResume/{userId}/{jobId}")
    public Integer deleteResume(@PathVariable("userId")Integer userId,
                                      @PathVariable("jobId")Integer jobId){//userId:投递用户id   jobId:投递工作的id
        checkUserUd(userId);
        if (jobId ==null ){
            throw new ParameterException(UtilParmeter.JOB_ID_CODE,UtilParmeter.JOB_ID_DESC);
        }
        //返回状态码
        //0：失败
        //1:成功
        Integer RES_CODE = 0;
        try {
            Integer res_code  =
                    restTemplate.getForObject("http://PROVIDER/vuedeleteResume/" + userId +"/" + jobId, Integer.class);
            if (res_code != null){
                RES_CODE = res_code;
            }
        }catch (Exception e){
        }
        return  RES_CODE;
    }

    //查询不合格简历
    @GetMapping("/vuegetAllNotResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllNotResumeByBossUserId(@PathVariable("userId")Integer userId){
        checkUserUd(userId);
        List<ResumeListDto> resumeListDtos = null;
        try {
            String ResumeListDtoJson = restTemplate.getForObject("http://PROVIDER/vuegetAllNotResumeBuBossId/" + userId, String.class);
            if (ResumeListDtoJson != null){
                resumeListDtos= JSONObject.parseArray(ResumeListDtoJson, ResumeListDto.class);
            }
        }catch (Exception e){
        }
        return resumeListDtos;
    }




    //查询已通知面试的简历列表
    @GetMapping("/vuegetAllSuccessResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllSuccsessResumeByBossUserId(@PathVariable("userId")Integer userId){
        checkUserUd(userId);

        List<ResumeListDto> resumeListDtos = null;
        try {
            String ResumeListDtoJson =
                    restTemplate.getForObject("http://PROVIDER/vuegetAllSuccessResumeBuBossId/" + userId, String.class);
            if (ResumeListDtoJson != null){
                resumeListDtos= JSONObject.parseArray(ResumeListDtoJson, ResumeListDto.class);
            }
        }catch (Exception e){
        }
        return resumeListDtos;
    }


    public  void checkUserUd(Integer userId){
        if (userId == null ){
            throw new ParameterException(UtilParmeter.User_ID,UtilParmeter.User_ID_DESC);
        }
    }



}

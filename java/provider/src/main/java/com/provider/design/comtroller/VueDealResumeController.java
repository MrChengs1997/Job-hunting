package com.provider.design.comtroller;

import com.provider.design.service.VueDealResumeService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilFeatures;
import core.design.pojo.ResumeListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 *  MrChengs
 *  2020/1/17
 *  处理简历模块
 */
@RestController
public class VueDealResumeController {

    @Autowired
    VueDealResumeService vueDealResumeService;

    //查询未处理的简历列表
    @GetMapping("/vuegetAllResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllResumeByBossUserId(@PathVariable("userId")Integer userId){
        List<ResumeListDto> resumeListDtos = new ArrayList<>();
        try {
            resumeListDtos = vueDealResumeService.getAllResumeByBossId(userId);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.SELECT_DEAL_CODE,UtilFeatures.SELECT_DEAL_DESC);
        }
        return resumeListDtos;
    }


    //处理合格简历进行修改数据
    @GetMapping("/vuequalifiedResume/{userId}/{jobId}")
    public Integer qualifiedResume(@PathVariable("userId")Integer userId,
                                   @PathVariable("jobId")Integer jobId){//userId:投递用户id   jobId:投递工作的id
        //返回状态码
        //0：失败
        //1:成功
        Integer RES_CODE = 0;
        try {
            Integer code = vueDealResumeService.qualifiedResume(userId, jobId);
            if (code != null){
                RES_CODE = code;
            }
        }catch (Exception r){
        }
        return  RES_CODE;
    }

    //处理不合格简历进行修改数据
    @GetMapping("/vuedisqualifiedResume/{userId}/{jobId}")
    public Integer disqualifiedResume(@PathVariable("userId")Integer userId,
                                   @PathVariable("jobId")Integer jobId){//userId:投递用户id   jobId:投递工作的id
        //返回状态码
        //0：失败
        //1:成功
        Integer RES_CODE = 0;
        try {
            Integer code = vueDealResumeService.disqualifiedResume(userId, jobId);
            if (code != null){
                RES_CODE = code;
            }
        }catch (Exception r){
        }
        return  RES_CODE;
    }


    //处理不合格简历进行修改数据
    @GetMapping("/vuedeleteResume/{userId}/{jobId}")
    public Integer deleteResume(@PathVariable("userId")Integer userId,
                                      @PathVariable("jobId")Integer jobId){//userId:投递用户id   jobId:投递工作的id
        //返回状态码
        //0：失败
        //1:成功
        Integer RES_CODE = 0;
        try {
            Integer code = vueDealResumeService.deleteResume(userId, jobId);
            if (code != null){
                RES_CODE = code;
            }
        }catch (Exception r){
        }
        return  RES_CODE;
    }



    //查询为处理的简历列表
    @GetMapping("/vuegetAllSuccessResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllSuccessResumeByBossUserId(@PathVariable("userId")Integer userId){

        List<ResumeListDto> resumeListDtos = new ArrayList<>();
        try {
            resumeListDtos = vueDealResumeService.getAllSuccessResumeByBossId(userId);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.SELECT_DEAL_CODE,UtilFeatures.SELECT_DEAL_DESC);
        }
        return resumeListDtos;
    }


    //查询不合格简历列表
    @GetMapping("/vuegetAllNotResumeBuBossId/{userId}")
    public List<ResumeListDto> getAllNotResumeByBossUserId(@PathVariable("userId")Integer userId){

        List<ResumeListDto> resumeListDtos = new ArrayList<>();
        try {
            resumeListDtos = vueDealResumeService.getAllNotResumeByBossId(userId);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.SELECT_DEAL_CODE,UtilFeatures.SELECT_DEAL_DESC);
        }
        return resumeListDtos;
    }


}

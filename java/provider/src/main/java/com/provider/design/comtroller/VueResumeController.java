package com.provider.design.comtroller;

import com.provider.design.service.VueResumeService;
import core.design.exception.FeaturesException;
import core.design.exception.ParameterException;
import core.design.exception.UtilFeatures;
import core.design.pojo.job.JobDetailDto;
import core.design.pojo.resume.ResumeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *  MrChengs
 *  2020/1/8
 *  简历相关
 */
@RestController
public class VueResumeController {

    @Autowired
    VueResumeService vueResumeService;

    //添加resume数据信息
    @PostMapping("/vueaddResume")
    public Integer addjobDetail(@RequestBody ResumeDto resumeDto){
        Integer ResultCode = 0;
        try {
            Integer addCode = vueResumeService.addResume(resumeDto);
            if (addCode ==1){
                ResultCode =1;
            }
        }catch (Exception e){
            throw new ParameterException(UtilFeatures.ADD_RESUME_CODE,UtilFeatures.ADD_RESUME_DESC);
        }
        return ResultCode;
    }


    //根据用户id进行查询是否已经创建简历
    //创建：1
    //为创建：0
    @GetMapping("/vuegetResumeCode/{userId}")
    public Integer getJobDetailByUserIdCode(@PathVariable("userId")Integer userId){
        Integer RES_CODE = 0;
        ResumeDto resumeDto = null;
        try {
            resumeDto = getResumeDtobyUserId(userId);
            if (resumeDto != null){
                RES_CODE = 1;
            }
        }catch (Exception e){
        }
        return RES_CODE;
    }



    //查询简历详情
    @GetMapping("/vuegetResumeDetail/{userId}")
    public ResumeDto getJobDetailByUserId(@PathVariable("userId")Integer userId){
        ResumeDto resumeDto = null;
        try {
            resumeDto = getResumeDtobyUserId(userId);
        }catch (Exception e){
        }
        return resumeDto;
    }


    //根据用户id获取相关信息
    public ResumeDto getResumeDtobyUserId(Integer userId){
        ResumeDto resumeDto = null;
        try {
            resumeDto = vueResumeService.getResumeDtoByUserId(userId);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.RES_BY_USERID_CODE,UtilFeatures.RES_BY_USERID_DESC);
        }
        return resumeDto;
    }





}

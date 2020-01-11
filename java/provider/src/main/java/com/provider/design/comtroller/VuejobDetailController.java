package com.provider.design.comtroller;

import com.provider.design.service.VuejobDetailService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilFeatures;
import core.design.pojo.job.JobDetailDto;
import core.design.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/*
 *  MrChengs
 *  2020/1/9
 *  工作操作
 */
@RestController
public class VuejobDetailController {

    @Autowired
    VuejobDetailService vuejobDetailService;

    @PostMapping("/vueaddjob")
    public Integer addjobDetail(@RequestBody JobDetailDto jobDetailDto){
        Integer RES_CODE = StatusCode.JOB_FAILD;
        try {
            //设置在线状态
            jobDetailDto.setJobExist(1);
            //设置开始时间
            jobDetailDto.setJobCreateDate(new Date());

            Integer code = vuejobDetailService.addJobDetail(jobDetailDto);
            if (code ==1){
                RES_CODE = StatusCode.JOB_SUCCESS;
            }
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.ADD_JOB_CODE,UtilFeatures.ADD_JOB_DESC);
        }
        return  RES_CODE;
    }

    //根据jobID进行删除指定的JobDetail数据（实质是将状态为变为1）
    //删除实质将数据字段变为3
    @GetMapping("/vuedeletejobdetail/{JobId}/{code}")
    public  Integer deleteIobDetailByJobId(@PathVariable("JobId")Integer JobId,@PathVariable("code")Integer code){
        Integer RES_CODE = StatusCode.JOB_OFF_FAILD;
        try {
            Integer UpdateCode = vuejobDetailService.deleteJobDetailsByJobId(JobId,code);
            if (UpdateCode ==1){
                RES_CODE = StatusCode.JOB_OFF_SUCCESS;
            }
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.DEL_JOB_CODE,UtilFeatures.DEL_JOB_DESC);
        }
        return RES_CODE;
    }

        //返回所有数据的接口
    @GetMapping("/vuegetjobDetail/{userId}")
    public List<JobDetailDto> getJobDetailByUserId(@PathVariable("userId")Integer userId){
        List<JobDetailDto> allJobDetailByUserId = getAllJobDetailByUserId(userId);
        return allJobDetailByUserId;
    }


    //查询指定用户下的所有数据
    //在线的  exist ==1
    //下线的  exist ==0
    public List<JobDetailDto> getAllJobDetailByUserId(Integer userId){
        List<JobDetailDto> jobDetailList = null;
        try {
            jobDetailList= vuejobDetailService.getJobDetailList(userId);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.SEL_USER_JOB,UtilFeatures.SEL_USER_JOB_CODE);
        }
        return  jobDetailList;
    }






}

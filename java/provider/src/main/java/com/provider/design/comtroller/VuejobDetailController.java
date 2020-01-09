package com.provider.design.comtroller;

import com.provider.design.service.VuejobDetailService;
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
        }
        return  RES_CODE;
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

        }
        return  jobDetailList;
    }






}

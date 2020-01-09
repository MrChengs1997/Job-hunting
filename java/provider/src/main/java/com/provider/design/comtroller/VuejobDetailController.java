package com.provider.design.comtroller;

import com.provider.design.service.VuejobDetailService;
import core.design.pojo.job.JobDetailDto;
import core.design.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    //查询指定用户下的所有数据
    //在线的  exist ==1
    //下线的  exist ==0
    public List<JobDetailDto> getAllJobDetailByUserId(String userId){
        List<JobDetailDto> jobDetailList = null;
        try {
            jobDetailList= vuejobDetailService.getJobDetailList(userId);
        }catch (Exception e){

        }
        return  jobDetailList;
    }






}

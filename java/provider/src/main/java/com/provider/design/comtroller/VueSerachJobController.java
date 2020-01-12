package com.provider.design.comtroller;

import com.provider.design.service.VueSerachJobService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilFeatures;
import core.design.pojo.job.JobDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 *  MrChengs
 *  2020/1/12
 *  job工作查询
 */
@RestController
public class VueSerachJobController {
    @Autowired
    VueSerachJobService vueSerachJobService;


    //查询最难的数据仅限20条数据
    @GetMapping("/getNewJobDetail")
    public List<JobDetailDto> getNewJobDetail(){
        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            jobDetailDtos = vueSerachJobService.getNewJobDetail();
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.NEW_JOB_CODE,UtilFeatures.NEW_JOB_DESC);
        }
        return  jobDetailDtos;
    }

    //查询热门的数据仅限20条数据
    @GetMapping("/getHotJobDetail")
    public List<JobDetailDto> getHotJobDetail(){
        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            jobDetailDtos = vueSerachJobService.getHotJobDetail();
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.NEW_JOB_CODE,UtilFeatures.NEW_JOB_DESC);
        }
        return  jobDetailDtos;
    }

    //根基serachName进新模糊查询
    @GetMapping("/getJobDetailByName/{serachName}")
    public List<JobDetailDto> getJobDetailByName(@PathVariable("serachName")String serachName){
        List<JobDetailDto> jobDetailDtos = new ArrayList<>();
        try {
            jobDetailDtos = vueSerachJobService.getJobByName(serachName);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.LIKE_JOB_CODE,UtilFeatures.LIKE_JOB_DESC);
        }
        return  jobDetailDtos;
    }


}

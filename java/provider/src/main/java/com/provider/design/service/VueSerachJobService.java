package com.provider.design.service;

import core.design.pojo.job.JobDetailDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/*
 *MrChengs
 *vue进行查询job
 * 2020/1/12
 */
public interface VueSerachJobService {
    //查询最新job仅限20条
    public List<JobDetailDto> getNewJobDetail();

    //热门职位查询
    public  List<JobDetailDto> getHotJobDetail();

    public  List<JobDetailDto> getJobByName(String serachName);


}

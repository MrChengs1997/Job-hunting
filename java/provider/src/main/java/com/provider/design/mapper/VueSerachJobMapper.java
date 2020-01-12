package com.provider.design.mapper;

import core.design.pojo.job.JobDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *MrChengs
 *vue进行查询job
 * 2020/1/12
 */
@Repository
@Mapper
public interface VueSerachJobMapper {
    //查询最新job仅限20条
    public List<JobDetailDto> getNewJobDetail();

    //热门职位查询
    public  List<JobDetailDto> getHotJobDetail();

    //查询job
    public  List<JobDetailDto> getJobByName(@Param("serachName") String serachName);


}

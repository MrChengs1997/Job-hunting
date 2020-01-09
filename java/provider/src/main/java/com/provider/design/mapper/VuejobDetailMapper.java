package com.provider.design.mapper;

import core.design.pojo.job.JobDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *  MrChengs
 *  2020/1/9
 *  添加工作
 */
@Repository
@Mapper
public interface VuejobDetailMapper {

    //添加招聘信息
    public Integer addJobDetail(JobDetailDto jobDetailDto);

    //查询所有数据
    public List<JobDetailDto> getJobDetailList(Integer userId);


}

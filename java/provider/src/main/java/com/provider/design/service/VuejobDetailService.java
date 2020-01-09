package com.provider.design.service;

import core.design.pojo.job.JobDetailDto;

import java.util.List;

/*
 *  MrChengs
 *  2020/1/9
 *  添加工作
 */
public interface VuejobDetailService {

    //添加招聘信息
    public Integer addJobDetail(JobDetailDto jobDetailDto);

    //查询所有数据
    public List<JobDetailDto> getJobDetailList(Integer userId);
}

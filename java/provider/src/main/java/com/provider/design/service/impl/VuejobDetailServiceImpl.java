package com.provider.design.service.impl;

import com.provider.design.mapper.VuejobDetailMapper;
import com.provider.design.service.VuejobDetailService;
import core.design.pojo.job.JobDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *  MrChengs
 *  2020/1/9
 *  添加工作
 */
@Service
public class VuejobDetailServiceImpl implements VuejobDetailService {

    @Autowired
    VuejobDetailMapper vuejobDetailMapper;

    @Override
    public Integer addJobDetail(JobDetailDto jobDetailDto) {
        return vuejobDetailMapper.addJobDetail(jobDetailDto);
    }

    @Override
    public List<JobDetailDto> getJobDetailList(String userId) {
        return vuejobDetailMapper.getJobDetailList(userId);
    }
}

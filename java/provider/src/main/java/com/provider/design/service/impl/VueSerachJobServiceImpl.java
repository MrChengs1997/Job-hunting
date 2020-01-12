package com.provider.design.service.impl;

import com.provider.design.mapper.VueSerachJobMapper;
import com.provider.design.service.VueSerachJobService;
import core.design.pojo.job.JobDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *MrChengs
 *vue进行查询job
 * 2020/1/12
 */
@Service
public class VueSerachJobServiceImpl implements VueSerachJobService {
    @Autowired
    VueSerachJobMapper vueSerachJobMapper;

    @Override
    public List<JobDetailDto> getNewJobDetail() {
        return vueSerachJobMapper.getNewJobDetail();
    }

    @Override
    public List<JobDetailDto> getHotJobDetail() {
        return vueSerachJobMapper.getHotJobDetail();
    }

    @Override
    public List<JobDetailDto> getJobByName(String serachName) {
        return vueSerachJobMapper.getJobByName(serachName);
    }
}

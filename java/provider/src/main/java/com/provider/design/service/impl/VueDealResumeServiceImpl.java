package com.provider.design.service.impl;

import com.provider.design.mapper.VueDealResumeMapper;
import com.provider.design.service.VueDealResumeService;
import core.design.pojo.ResumeListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueDealResumeServiceImpl implements VueDealResumeService {

    @Autowired
    VueDealResumeMapper vueDealResumeMapper;

    @Override
    public List<ResumeListDto> getAllResumeByBossId(Integer userId) {
        return vueDealResumeMapper.getAllResumeByBossId(userId);
    }
}

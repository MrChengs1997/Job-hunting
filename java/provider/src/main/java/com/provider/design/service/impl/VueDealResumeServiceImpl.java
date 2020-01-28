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

    @Override
    public List<ResumeListDto> getAllSuccessResumeByBossId(Integer userId) {
        return vueDealResumeMapper.getAllSuccessResumeByBossId(userId);
    }

    @Override
    public Integer qualifiedResume(Integer userId, Integer jobId) {
        return vueDealResumeMapper.qualifiedResume(userId,jobId);
    }

    @Override
    public Integer disqualifiedResume(Integer userId, Integer jobId) {
        return vueDealResumeMapper.disqualifiedResume(userId,jobId);
    }

    @Override
    public Integer deleteResume(Integer userId, Integer jobId) {
        return vueDealResumeMapper.deleteResume(userId,jobId);
    }

    @Override
    public List<ResumeListDto> getAllNotResumeByBossId(Integer userId) {
        return vueDealResumeMapper.getAllNotResumeByBossId(userId);
    }
}

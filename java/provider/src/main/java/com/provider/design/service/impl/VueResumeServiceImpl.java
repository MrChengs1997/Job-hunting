package com.provider.design.service.impl;

import com.provider.design.mapper.VueResumeMapper;
import com.provider.design.service.VueResumeService;
import core.design.pojo.resume.ResumeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueResumeServiceImpl implements VueResumeService {
    @Autowired
    VueResumeMapper vueResumeMapper;

    @Override
    public ResumeDto getResumeDtoByUserId(Integer userId) {
        return vueResumeMapper.getResumeDtoByUserId(userId);
    }

    @Override
    public Integer addResume(ResumeDto resumeDto) {
        return vueResumeMapper.addResume(resumeDto);
    }
}

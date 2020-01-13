package com.provider.design.service;

import core.design.pojo.resume.ResumeDto;

public interface VueResumeService {

    //根据用户id获取详细信息
    public ResumeDto getResumeDtoByUserId(Integer userId);
}

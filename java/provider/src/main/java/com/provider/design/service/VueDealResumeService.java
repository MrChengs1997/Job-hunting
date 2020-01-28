package com.provider.design.service;


import core.design.pojo.ResumeListDto;

import java.util.List;

public interface VueDealResumeService {

    public List<ResumeListDto> getAllResumeByBossId(Integer userId);

    public List<ResumeListDto> getAllSuccessResumeByBossId(Integer userId);

    public Integer qualifiedResume(Integer userId,Integer jobId);

    public Integer disqualifiedResume(Integer userId,Integer jobId);

    public Integer deleteResume(Integer userId,Integer jobId);

    public List<ResumeListDto> getAllNotResumeByBossId( Integer userId);
}

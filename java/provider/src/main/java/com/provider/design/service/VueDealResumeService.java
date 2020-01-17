package com.provider.design.service;


import core.design.pojo.ResumeListDto;

import java.util.List;

public interface VueDealResumeService {

    public List<ResumeListDto> getAllResumeByBossId(Integer userId);

}

package com.provider.design.mapper;

import core.design.pojo.ResumeListDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *MrChengs
 *查询待处理简历
 * 2020/1/17
 */
@Repository
@Mapper
public interface VueDealResumeMapper {


    //查询未处理的简历投递列表
    public List<ResumeListDto> getAllResumeByBossId(@Param("userId") Integer userId);

    //查询不合适简历列表
    public List<ResumeListDto> getAllNotResumeByBossId(@Param("userId") Integer userId);

    //查询已经通知邀请面试的简历列表
    public List<ResumeListDto> getAllSuccessResumeByBossId(@Param("userId") Integer userId);

    //同意简历
    public Integer qualifiedResume(@Param("userId")Integer userId,@Param("jobId")Integer jobId);

    //不合格简历
    public Integer disqualifiedResume(@Param("userId")Integer userId,@Param("jobId")Integer jobId);


    //不合格简历
    public Integer deleteResume(@Param("userId")Integer userId,@Param("jobId")Integer jobId);



}

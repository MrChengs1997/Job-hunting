package com.provider.design.mapper;

import core.design.pojo.resume.ResumeDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/*
 *MrChengs
 *简历操作
 * 2020/1/13
 */
@Repository
@Mapper
public interface VueResumeMapper {

    //根据用户id获取详细信息
    public ResumeDto getResumeDtoByUserId(@Param("userId")Integer userId);

    //添加简历信息
    public  Integer addResume(ResumeDto resumeDto);
}

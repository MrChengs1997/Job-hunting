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


    public List<ResumeListDto> getAllResumeByBossId(@Param("userId") Integer userId);

}

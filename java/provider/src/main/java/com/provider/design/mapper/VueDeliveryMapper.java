package com.provider.design.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *MrChengs
 *进行投递简历
 * 2020/1/16
 */
@Repository
@Mapper
public interface VueDeliveryMapper {


    //进行添加简历
    public Integer addDelivery(@Param("userId") Integer userId, @Param("jobId")Integer jobId);

    //查询是否已经投递过
    public List<Integer> isDelivery(@Param("userId") Integer userId);



}

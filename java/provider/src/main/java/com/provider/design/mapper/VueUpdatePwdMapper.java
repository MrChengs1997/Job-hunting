package com.provider.design.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/*
 *  MrChengs
 *  2020/1/7
 *  修改密码
 */
@Repository
@Mapper
public interface VueUpdatePwdMapper {
    public Integer updatePassword(@Param("email")String email,@Param("pwd")String pwd);
}

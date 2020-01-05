package com.provider.design.mapper;

import core.design.pojo.user.UserDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/*
 *MrChengs
 *vue端进行登陆&注册Mapper
 * 2020/1/5
 */
@Repository
@Mapper
public interface VueLoginAndRegisterMapper {
    //注册账户
    public int register(UserDetailDto userDetailDto);

    //检查账户是否存在
    public Integer checkUserExist(@Param("email")String email);

    //登陆
    public String login(@Param("email")String email );

}

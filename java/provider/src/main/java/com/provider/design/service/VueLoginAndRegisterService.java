package com.provider.design.service;

import core.design.pojo.user.UserDetailDto;
import org.apache.ibatis.annotations.Param;

/*
 *MrChengs
 *vue端进行登陆&注册service
 * 2020/1/5
 */

public interface VueLoginAndRegisterService {

    //注册账户
    public int register(UserDetailDto userDetailDto);

    //检查账户是否存在
    public UserDetailDto checkUserExist(String email);

    //登陆
    public String login(@Param("email")String email );

}

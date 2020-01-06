package com.provider.design.service.impl;

import com.provider.design.mapper.VueLoginAndRegisterMapper;
import com.provider.design.service.VueLoginAndRegisterService;
import core.design.pojo.user.UserDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *MrChengs
 *vue端进行登陆&注册service
 * 2020/1/5
 */
@Service
public class VueLoginAndRegisterServiceImpl implements VueLoginAndRegisterService {


    @Autowired
    VueLoginAndRegisterMapper vueLoginAndRegisterMapper;

    @Override
    public int register(UserDetailDto userDetailDto) {
        return vueLoginAndRegisterMapper.register(userDetailDto);
    }

    @Override
    public UserDetailDto checkUserExist(String email) {
        return vueLoginAndRegisterMapper.checkUserExist(email);
    }

    @Override
    public String login(String email) {
        return vueLoginAndRegisterMapper.login(email);
    }
}

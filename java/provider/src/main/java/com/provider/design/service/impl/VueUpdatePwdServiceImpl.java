package com.provider.design.service.impl;

import com.provider.design.mapper.VueUpdatePwdMapper;
import com.provider.design.service.VueUpdatePwdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueUpdatePwdServiceImpl implements VueUpdatePwdService {


    @Autowired
    VueUpdatePwdMapper vueUpdatePwdMapper;

    @Override
    public Integer updatePassword(String email, String pwd) {
        return vueUpdatePwdMapper.updatePassword(email,pwd);
    }
}

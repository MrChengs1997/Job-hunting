package com.provider.design.service.impl;

import com.provider.design.mapper.VueDeliveryMapper;
import com.provider.design.service.VueDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *MrChengs
 *进行投递简历
 * 2020/1/16
 */
@Service
public class VueDeliveryServiceImpl implements VueDeliveryService {

    @Autowired
    VueDeliveryMapper vueDeliveryMapper;

    @Override
    public Integer addDelivery(Integer userId, Integer jobId) {
        return vueDeliveryMapper.addDelivery(userId,jobId);
    }

    @Override
    public Integer isDelivery(Integer userId) {
        return vueDeliveryMapper.isDelivery(userId);
    }
}

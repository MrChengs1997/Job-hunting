package com.provider.design.service;

/*
 *MrChengs
 *进行投递简历
 * 2020/1/16
 */
public interface VueDeliveryService {

    public Integer addDelivery(Integer userId, Integer jobId);

    public Integer isDelivery( Integer userId);


}

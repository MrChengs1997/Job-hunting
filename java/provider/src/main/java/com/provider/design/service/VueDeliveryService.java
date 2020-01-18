package com.provider.design.service;

import java.util.List;

/*
 *MrChengs
 *进行投递简历
 * 2020/1/16
 */
public interface VueDeliveryService {

    public Integer addDelivery(Integer userId, Integer jobId);

    public List<Integer> isDelivery(Integer userId);


}

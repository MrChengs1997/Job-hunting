package com.consumer.design.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * MrChengs
 * 2020/1/16
 * 简历相关
 */
@CrossOrigin
@RestController
public class VueDeliveryController {


    @Autowired
    RestTemplate restTemplate;

    /**
     * 进行投递简历
     * @param userId
     * @param jobId
     * @return  0：已经投递过的公司（投递失败）    1：表示没有投递过（投递成功）
     */
    @PostMapping(value = "/vuedelivery/{userId}/{jobId}",produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Integer deliveryToBoss(@PathVariable("userId")Integer userId,@PathVariable("jobId")Integer jobId){
        Integer ResultCode = 0;
        try {
            Integer addDeliverCode =
                    restTemplate.getForObject("http://PROVIDER/vuedelivery/" + userId+"/"+jobId, Integer.class);
            if (addDeliverCode ==1){//添加成功（投递成功）
                ResultCode = 1;
            }
        }catch (Exception e){
        }
        return  ResultCode;
    }


    /**
     * 进行投递简历:检测简历是否已经投递过
     * @param userId
     * @param jobId
     * @return  返回0:代表投递已经投递过    返回1:代表投递没有投递过
     */
    @PostMapping(value = "/vueISdelivery/{userId}/{jobId}",produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Integer isdeliveryToBoss(@PathVariable("userId")Integer userId,@PathVariable("jobId")Integer jobId){
        Integer ResultCode = 0;
        try {
            //返回0:代表投递已经投递过
            //返回1:代表投递没有投递过
            Integer addDeliverCode =
                    restTemplate.getForObject("http://PROVIDER/vueISdelivery/" + userId+"/"+jobId, Integer.class);
            if (addDeliverCode ==0){
                ResultCode = 0;
            }
            if (addDeliverCode ==1){
                ResultCode = 1;
            }
        }catch (Exception e){
        }
        return  ResultCode;
    }



}

package com.provider.design.comtroller;


import com.provider.design.service.VueDeliveryService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilParmeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  MrChengs
 *  2020/1/16
 *  简历投递
 */
@RestController
public class VueDeliveryController {

    @Autowired
    VueDeliveryService vueDeliveryService;

    //返回0:代表投递失败
    //返回1:代表投递成功
    @GetMapping(value = "/vuedelivery/{userId}/{jobId}")
    public Integer deliveryToBoss(@PathVariable("userId")Integer userId, @PathVariable("jobId")Integer jobId){
        Integer ResultCode = 0;
        try {
            Integer addCode = vueDeliveryService.addDelivery(userId, jobId);
            if (addCode ==1){
                ResultCode =1;
            }
        }catch (Exception e){
            throw new FeaturesException(UtilParmeter.DEL_CODE,UtilParmeter.DEL_DESC);
        }
        return ResultCode;
    }


    //返回0:代表投递已经投递过
    //返回1:代表投递没有投递过
    @GetMapping(value = "/vueISdelivery/{userId}/{jobId}")
    public Integer isdeliveryToBoss(@PathVariable("userId")Integer userId, @PathVariable("jobId")Integer jobId){
        Integer ResultCode = 1;
        try {
            Integer job_id = vueDeliveryService.isDelivery(userId);
            if (job_id !=null){
                if (job_id == jobId){
                    ResultCode = 0;
                }
            }
        }catch (Exception e){
            throw new FeaturesException(UtilParmeter.DEL_CODE,UtilParmeter.DEL_DESC);
        }
        return ResultCode;
    }


}

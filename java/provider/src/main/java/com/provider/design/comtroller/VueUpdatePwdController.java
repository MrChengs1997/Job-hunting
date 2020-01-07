package com.provider.design.comtroller;
import com.provider.design.service.VueUpdatePwdService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilFeatures;
import core.design.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *  MrChengs
 *  2020/1/7
 *  修改密码
 */
@RestController
public class VueUpdatePwdController {
    @Autowired
    VueUpdatePwdService updatePwdService;


    @GetMapping("/vueupdatepwd")
    public Integer update( String email,String password){
        Integer RES_CODE = StatusCode.UP_PWD_FAILD;//默认返回失败
        try {
            //修改成功返回参数
            Integer UP_CODE = updatePwdService.updatePassword(email, password);
            if (UP_CODE == 1){
                RES_CODE =  StatusCode.UP_PWD_SUCCESS;
            }
        }catch (Exception e){
            throw  new FeaturesException(UtilFeatures.UP_PWD_CODE,UtilFeatures.UP_PWD_CODE_DESC);
        }
        return RES_CODE;
    }

}

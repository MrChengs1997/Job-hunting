package com.consumer.design.controller;
import core.design.exception.FeaturesException;
import core.design.exception.ParameterException;
import core.design.exception.UtilFeatures;
import core.design.exception.UtilParmeter;
import core.design.pojo.user.UserDetailDto;
import core.design.util.StatusCode;
import core.design.util.URLUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/*
 *  MrChengs
 *  2020/1/7
 *  修改密码
 */
@CrossOrigin
@RestController
public class VueUpdatePwdController {

    @Autowired
    RestTemplate restTemplate;


    @PutMapping("/vueupdate/{email}/{password}")
    public Integer update(@PathVariable("email") String email, @PathVariable("password")String password){
        checkparams(email,password);

        Integer UP_OP_CODE = StatusCode.UP_PWD_FAILD;//默认操作失败

        try {

            String bash = "http://PROVIDER/vueupdatepwd";
            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.add("email",email);
            params.add("password",password);

            ResponseEntity<Integer> up_msg_code = restTemplate.getForEntity(URLUtil.getURI(bash, params), Integer.class);

            //    public  static  Integer UP_PWD_SUCCESS = 1;//修改成功
            //    public  static  Integer UP_PWD_FAILD = 0;//修改失败
            Integer body = up_msg_code.getBody();

            if (body == 0 ){//修改密码失败
                return UP_OP_CODE;
            }

            if (body ==1){//修改密码成功
                UP_OP_CODE = StatusCode.UP_PWD_SUCCESS;
            }
        }catch (Exception e){
            throw  new FeaturesException(UtilFeatures.UP_PWD_CODE,UtilFeatures.UP_PWD_CODE_DESC);
        }

        return  UP_OP_CODE;
    }

    public void  checkparams(String email,String password){
        if (email == null){
         throw new ParameterException(UtilParmeter.User_Email,UtilParmeter.User_Email_DESC);
        }
        if (password == null){
            throw new ParameterException(UtilParmeter.User_PAD,UtilParmeter.User_PAD_DESC);
        }
    }

}

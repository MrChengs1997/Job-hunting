package com.consumer.design.controller;


import core.design.exception.FeaturesException;
import core.design.exception.ParameterException;
import core.design.exception.UtilFeatures;
import core.design.exception.UtilParmeter;
import core.design.pojo.user.UserDetailDto;
import core.design.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@CrossOrigin
@Controller
public class VueUserLoginAndRegisterController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(path="/register")
    @ResponseBody
    public Integer register(UserDetailDto userDetailDto){
        checkParam(userDetailDto);

        if (userDetailDto.getUserAttr() ==null){
            throw  new ParameterException(UtilParmeter.User_Attr,UtilParmeter.User_Attr_DESC);
        }

        try {
            //调用register接口
            ResponseEntity<Integer> registerCode = restTemplate.postForEntity("http://PROVIDER/register", userDetailDto, Integer.class);

            return  registerCode.getBody();
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.REGISTER_CODE,UtilFeatures.REGISTER_CODE_DESC);
        }
    }


    @GetMapping(path="/login")
    @ResponseBody
    public Integer login(UserDetailDto userDetailDto){

        checkParam(userDetailDto);

        Integer RES_CODE = StatusCode.LOG_FAILD_DOCE;//密码不正确0

        try {
            String baseUrl = "http://PROVIDER/login";
            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.add("email",userDetailDto.getUserEmail());
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl);
            URI uri = builder.queryParams(params).build().encode().toUri();

            //调用register接口
            ResponseEntity<String> password = restTemplate.getForEntity(uri, String.class);

            String pwd = password.getBody();
            if (password.getBody() != null){
                if (password.getBody().equals(userDetailDto.getUserPwd())){
                    RES_CODE = StatusCode.LOG_SUCCESS_DOCE;//密码成功返回1
                }
            }

        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.REGISTER_CODE,UtilFeatures.REGISTER_CODE_DESC);
        }
        return RES_CODE;
    }

    //检验参数
    public void checkParam(UserDetailDto userDetailDto){
        if (userDetailDto.getUserEmail() ==null){
            throw  new ParameterException(UtilParmeter.User_Email,UtilParmeter.User_Email_DESC);
        }
        if (userDetailDto.getUserPwd() ==null){
            throw  new ParameterException(UtilParmeter.User_PAD,UtilParmeter.User_PAD_DESC);
        }
    }


}

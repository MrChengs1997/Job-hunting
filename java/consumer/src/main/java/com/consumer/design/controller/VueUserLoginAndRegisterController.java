package com.consumer.design.controller;


import com.alibaba.fastjson.JSON;
import core.design.exception.FeaturesException;
import core.design.exception.ParameterException;
import core.design.exception.UtilFeatures;
import core.design.exception.UtilParmeter;
import core.design.pojo.user.UserDetailCodeDto;
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

    @GetMapping(path="/vueregister")
    @ResponseBody
    public Integer register(UserDetailDto userDetailDto){
        checkParam(userDetailDto);

        if (userDetailDto.getUserAttr() ==null){
            throw  new ParameterException(UtilParmeter.User_Attr,UtilParmeter.User_Attr_DESC);
        }

        try {
            //调用register接口
            ResponseEntity<Integer> registerCode = restTemplate.postForEntity("http://PROVIDER/vueregister", userDetailDto, Integer.class);

            return  registerCode.getBody();
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.REGISTER_CODE,UtilFeatures.REGISTER_CODE_DESC);
        }
    }


    @GetMapping(path="/vuelogin")
    @ResponseBody
    public UserDetailCodeDto login(UserDetailDto userDetailDto){

        checkParam(userDetailDto);
        //返回参数对象
        UserDetailCodeDto userDetailCodeDto = new UserDetailCodeDto();
        Integer RES_CODE = StatusCode.LOG_FAILD_DOCE;//密码不正确0

        try {
            String baseUrl = "http://PROVIDER/vuelogin";
            MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
            params.add("email",userDetailDto.getUserEmail());
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl);
            URI uri = builder.queryParams(params).build().encode().toUri();

            //调用register接口进行比对密码
            ResponseEntity<String> password = restTemplate.getForEntity(uri, String.class);

            String pwd = password.getBody();
            if (password.getBody() != null){
                //密码比对成功
                if (password.getBody().equals(userDetailDto.getUserPwd())){
                    RES_CODE = StatusCode.LOG_SUCCESS_DOCE;//密码成功返回1
                    //调接口返回用户信息
                    baseUrl = "http://PROVIDER/vueusermsg";
                    builder = UriComponentsBuilder.fromHttpUrl(baseUrl);
                    uri = builder.queryParams(params).build().encode().toUri();
                    ResponseEntity<String> userMsg = restTemplate.getForEntity(uri, String.class);
                    //json转换为对象
                    UserDetailDto userDetailDtoMsg = JSON.parseObject(userMsg.getBody(), UserDetailDto.class);

                    System.out.println(userDetailDtoMsg);
                    //设置返回参数对象信息
                    userDetailCodeDto.setUserAttr(userDetailDtoMsg.getUserAttr());
                    userDetailCodeDto.setUserEmail(userDetailDtoMsg.getUserEmail());
                    userDetailCodeDto.setUserId(userDetailDtoMsg.getUserId());
                    userDetailCodeDto.setUserPwd(userDetailDtoMsg.getUserPwd());
                }
            }
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.REGISTER_CODE,UtilFeatures.REGISTER_CODE_DESC);
        }
        //返回参数的状态码
        userDetailCodeDto.setResultCode(RES_CODE);
        return userDetailCodeDto;
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

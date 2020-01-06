package com.provider.design.comtroller;

import com.provider.design.service.VueLoginAndRegisterService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilFeatures;
import core.design.pojo.user.UserDetailDto;
import core.design.util.StatusCode;
import org.apache.tomcat.util.descriptor.web.WebXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
/*
 *MrChengs
 *vue端进行登陆&注册controller
 * 2020/1/5
 */

@Controller
public class VueLoginAndRegisterController {


    @Autowired
    VueLoginAndRegisterService vueLoginAndRegisterService;

    //异常以及失败返回0
    //注册成功返回1
    //注册用户数据已经存在返回2
    @PostMapping("/vueregister")
    @ResponseBody
    public int register(@RequestBody UserDetailDto userDetailDto) {
        Integer registerNum = StatusCode.REG_ERR_FAIL_CODE;
        try {
            //检查用户使用已经存在
            //UserDetailDto userId = vueLoginAndRegisterService.checkUserExist(userDetailDto.getUserEmail());

            if (isExistUser(userDetailDto.getUserEmail())){
                registerNum = StatusCode.REG_EXIST;
                return registerNum;
            }
            //进行注册用户
            vueLoginAndRegisterService.register(userDetailDto);

        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.REGISTER_CODE,UtilFeatures.REGISTER_CODE_DESC);
        }
        registerNum = StatusCode.REG_SUCCESS_CODE;
        return  registerNum;

    }

    //登录
    @GetMapping("/vuelogin")
    @ResponseBody
    public String login(String email) {
        String password = null;
        try {
            password = vueLoginAndRegisterService.login(email);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.REGISTER_CODE,UtilFeatures.REGISTER_CODE_DESC);
        }
        return  password;
    }

    //返回用户信息
    @GetMapping("/vueusermsg")
    @ResponseBody
    public UserDetailDto userMsg(String email) {
        UserDetailDto userDto ;
        try {
             userDto = vueLoginAndRegisterService.checkUserExist(email);
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.REGISTER_CODE,UtilFeatures.REGISTER_CODE_DESC);
        }
        return  userDto;
    }


    public  boolean isExistUser(String email){

        boolean isExist = false;
        try {
            UserDetailDto userId = vueLoginAndRegisterService.checkUserExist(email);
            if (userId != null ){
                isExist = true;
            }
        }catch (Exception e){

        }
        //检查用户使用已经存在

        return isExist;

    }
}

package com.consumer.design.controller;

import com.alibaba.fastjson.JSON;
import core.design.exception.FeaturesException;
import core.design.exception.ParameterException;
import core.design.exception.UtilFeatures;
import core.design.exception.UtilParmeter;
import core.design.pojo.company.CompanyDetailDto;
import core.design.pojo.user.UserDetailDto;
import core.design.util.URLUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import javax.validation.Valid;

/*
 *  MrChengs
 *  2020/1/7
 *  公司查询修改相关
 */
@CrossOrigin
@RestController
public class VueCompanyController {

    @Autowired
    RestTemplate restTemplate;

    //获取company详细细信息
    @GetMapping("/vuegetcompany/{email}")
    public CompanyDetailDto getCompany(@PathVariable("email")String email){

        CompanyDetailDto companyDetailDto = null;
        try {
            String companyDtoJson = restTemplate.getForObject("http://PROVIDER/vuegetcompany/" + email, String.class);

            companyDetailDto= JSON.parseObject(companyDtoJson, CompanyDetailDto.class);

        }catch (Exception e){

        }


        return  null;
    }


    //添加company
    @PostMapping("/vueaddcompany/{email}")
    public  Integer addConpany(@RequestBody @Valid CompanyDetailDto companyDetailDto,
                              @PathVariable("email")String email){
        checkparams(companyDetailDto);
        checkEmail(email);

        Integer RES_CODE = 0;

        try {
            //查询用户id封装在CompanyDetailDto中 接口：vueusermsg
            //调接口返回用户信息
            String baseUrl = "http://PROVIDER/vueusermsg";
            MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
            params.add("email",email);

            ResponseEntity<String> userEntityJson = restTemplate.getForEntity(URLUtil.getURI(baseUrl, params), String.class);
            //JSOn转为对象
           if (userEntityJson != null){
               UserDetailDto userDetailDtoMsg = JSON.parseObject(userEntityJson.getBody(), UserDetailDto.class);
                companyDetailDto.setCompanyUserId(userDetailDtoMsg.getUserId());
           }

           //调用新增接口
            ResponseEntity<Integer> addComCode = restTemplate.postForEntity("http://PROVIDER/vueaddcompany", companyDetailDto, Integer.class);

            RES_CODE = addComCode.getBody();
        }catch (Exception e){
        }
        return RES_CODE;
    }


    //进行查询改Boss是否已经绑定公司
    //检验当前用户是否已经绑定公司
    //没有申请绑定公司->0
    //申请绑定公司正在审批->1
    // 申请通过->2
    @GetMapping("/vueisbindcompany")
    public Integer isaccountBind(String email){
        checkEmail(email);
        try {
            String bash = "http://PROVIDER/isbindcompany";
            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.add("email",email);
            ResponseEntity<Integer> bind_code = restTemplate.getForEntity(URLUtil.getURI(bash, params), Integer.class);

            if (bind_code.getBody() == 0){
                return  0;
            }else if(bind_code.getBody() == 1){
                return 1;
            }else {
                return 2;
            }
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.COM_BY_USER_EMAIL_CODE,UtilFeatures.COM_BY_USER_EMAIL_DESC);

        }
    }


    //校验CompanyDetailDto字段属性是否为空
    public  void checkparams(CompanyDetailDto companyDetailDto){
        if (companyDetailDto.getCompanyWholeName() == null){
            throw new ParameterException(UtilParmeter.COM_WHOLE_NAME_CODE,UtilParmeter.COM_WHOLE_NAME_DESC);
        }
        if (companyDetailDto.getCompamyShortName() == null){
            throw new ParameterException(UtilParmeter.COM_SHORT_NAME_CODE,UtilParmeter.COM_SHORT_NAME_DESC);
        }
        if (companyDetailDto.getCompanyProfile() == null){
            throw new ParameterException(UtilParmeter.COM_PROFILE_CODE,UtilParmeter.COM_PROFILE_DESC);
        }
        if (companyDetailDto.getCompanyDevelopment() == null){
            throw new ParameterException(UtilParmeter.COM_DEV_CODE,UtilParmeter.COM_DEV_DESC);
        }
        if (companyDetailDto.getCompanySize() == null){
            throw new ParameterException(UtilParmeter.COM_SIZE_CODE,UtilParmeter.COM_SIZE_DESC);
        }
        if (companyDetailDto.getCompanyField() == null){
            throw new ParameterException(UtilParmeter.COM_FIELD_CODE,UtilParmeter.COM_FIELD_DESC);
        }
        if (companyDetailDto.getCompanyLocation() == null){
            throw new ParameterException(UtilParmeter.COM_LOC_CODE,UtilParmeter.COM_LOC_DESC);
        }
        if (companyDetailDto.getCompanyCeo() == null){
            throw new ParameterException(UtilParmeter.COM_CEO_CODE,UtilParmeter.COM_CEO_DESC);
        }
        if (companyDetailDto.getCompanyWebsite() == null){
            throw new ParameterException(UtilParmeter.COM_WEB_CODE,UtilParmeter.COM_WEB_DESC);
        }

    }

    //校验email
    public  void checkEmail(String email){
        if (email == null){
            throw new ParameterException(UtilParmeter.User_Email,UtilParmeter.User_Email_DESC);
        }
    }

}

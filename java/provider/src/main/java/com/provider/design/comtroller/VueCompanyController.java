package com.provider.design.comtroller;

import com.provider.design.service.VueCompanyService;
import core.design.exception.FeaturesException;
import core.design.exception.UtilFeatures;
import core.design.pojo.company.CompanyDetailDto;
import core.design.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/*
 *  MrChengs
 *  2020/1/8
 *  公司查询修改相关
 */
@RestController
public class VueCompanyController {

    @Autowired
    VueCompanyService vueCompanyService;

    //添加公司信息认证
    @PostMapping("/vueaddcompany")
    public Integer addCompany(@RequestBody CompanyDetailDto companyDetailDto){
        //认证字段设置为0
        Integer RES_CODE = 0;
        companyDetailDto.setCompanyAuto(0);
        try {
            Integer addCode = vueCompanyService.addCompany(companyDetailDto);
            RES_CODE = addCode;
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.COM_ADD_CODE,UtilFeatures.COM_ADD_DESC);
        }
        return  RES_CODE;
    }


    //检验当前用户是否已经绑定公司
    //没有申请绑定公司->0
    //申请绑定公司正在审批->1
    //申请通过->2
    @GetMapping("/isbindcompany")
    public Integer bindCompany(String email) throws Exception {

        Integer RES_CODE = StatusCode.COM_NOT_APP;

        CompanyDetailDto companyDetailDto = selectCompanyByUserEmail(email);

        //companyDetailDto为null：未申请
        if (companyDetailDto == null){
            return RES_CODE;
        }
        //companyDetailDto不为null查询状态位
        if (companyDetailDto != null){
            if (companyDetailDto.getCompanyAuto() == 0){
                //已经提交申请，管理员未通过
                RES_CODE = StatusCode.COM_APP_APP;
                return RES_CODE;
            }else if (companyDetailDto.getCompanyAuto() == 1){
                //申请通过->2
                RES_CODE = StatusCode.COM_APP_SUCCESS;
                return RES_CODE;
            }else {
                return  RES_CODE;
            }
        }else {
            return  RES_CODE;
        }
    }



    //根据员工email查询公司详情
    public CompanyDetailDto selectCompanyByUserEmail(String email){
        try {
            CompanyDetailDto companyDetailDto = vueCompanyService.selectCompanyByUserEmail(email);
            return  companyDetailDto;
        }catch (Exception e){
            throw new FeaturesException(UtilFeatures.COM_BY_USER_EMAIL_CODE,UtilFeatures.COM_BY_USER_EMAIL_DESC);
        }
    }



}

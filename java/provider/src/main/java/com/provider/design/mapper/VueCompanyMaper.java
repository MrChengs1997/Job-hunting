package com.provider.design.mapper;

import core.design.pojo.company.CompanyDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/*
 *MrChengs
 *vue端进行登陆&注册Mapper
 * 2020/1/8
 */
@Repository
@Mapper
public interface VueCompanyMaper {

    //根据用户邮箱查询公司详情
    public CompanyDetailDto selectCompanyByUserEmail(@Param("email")String email);

    //新增company
    public Integer addCompany(CompanyDetailDto companyDetailDto);

}


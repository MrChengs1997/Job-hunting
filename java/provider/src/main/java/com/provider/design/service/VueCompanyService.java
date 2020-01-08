package com.provider.design.service;

import core.design.pojo.company.CompanyDetailDto;

/*
 *  MrChengs
 *  2020/1/8
 *  公司查询修改相关
 */
public interface VueCompanyService {

    //根据用户邮箱查询公司详情
    public CompanyDetailDto selectCompanyByUserEmail(String email);

    //新增company
    public Integer addCompany(CompanyDetailDto companyDetailDto);
}

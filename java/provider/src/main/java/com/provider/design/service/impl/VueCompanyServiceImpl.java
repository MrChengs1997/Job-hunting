package com.provider.design.service.impl;

import com.provider.design.mapper.VueCompanyMaper;
import com.provider.design.service.VueCompanyService;
import core.design.pojo.company.CompanyDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;

/*
 *  MrChengs
 *  2020/1/8
 *  公司查询修改相关
 */

@Service
public class VueCompanyServiceImpl implements VueCompanyService {

    @Autowired
    VueCompanyMaper vueCompanyMaper;

    @Override
    public CompanyDetailDto selectCompanyByUserEmail(String email) {
        return vueCompanyMaper.selectCompanyByUserEmail(email);
    }

    @Override
    public Integer addCompany(CompanyDetailDto companyDetailDto) {
        return vueCompanyMaper.addCompany(companyDetailDto);
    }
}

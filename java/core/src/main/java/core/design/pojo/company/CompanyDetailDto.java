package core.design.pojo.company;

import lombok.Data;

@Data
public class CompanyDetailDto {

    private Integer CompanyId;//公司id
    private Integer CompanyUserId;//公司绑定职员id
    private String companyWholeName;//公司全称
    private String compamyShortName;//简称
    private String companyWebsite;//网址
    private String companyLocation;//地址
    private  String companyField;//公司业务领域
    private String companySize;//公司规模
    private String companyDevelopment;//公司大战阶段
    private String companyProfile;//公司介绍
    private String companyCeo;//ceo
    private Integer companyAuto;//认证阶段
}

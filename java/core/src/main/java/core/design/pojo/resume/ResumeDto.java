package core.design.pojo.resume;

import lombok.Data;

import java.util.Date;

@Data
public class ResumeDto {
    private Integer resumeId;//简历id
    private Integer resumeUserId;//绑定用户id
    private String resumeName;//简历姓名
    private String resumeSex;//简历性别
    private String resumeEduc;//简历简历学历
    private String resumeExpectWork;//简历简历期望工作
    private String resumeWorkExper;//工作经历
    private String resumeProjectExper;//项目经验
    private String resumeWorksAddr;//作品地址
    private String resumePhone;//联系方式
    private String resumeDesc;//自我描述
    private String resumeWorkYear;//工作年限
    private Date resumeCreateDate;//创建时间

}

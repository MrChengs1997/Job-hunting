package core.design.pojo.job;

import lombok.Data;

import java.util.Date;

@Data
public class JobDetailDto {

    private Integer JobId;
    private Integer JobComId;
    private Integer JobUserId;
    private String JobCategory;
    private String JobName;
    private String JobDept;
    private String JobNature;
    private Integer JobSalaryMin;
    private Integer JobSalaryMax;
    private String JobCity;
    private String JobExper;
    private String JobEduc;
    private String JobDesc;
    private Integer JobExist;
    private Date JobCreateDate;
    private Date JobEndDate;
    private String JobAddress;





}

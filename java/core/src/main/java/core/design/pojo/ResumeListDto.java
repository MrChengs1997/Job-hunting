package core.design.pojo;

import core.design.pojo.resume.ResumeDto;
import lombok.Data;

import java.util.Date;

@Data
public class ResumeListDto extends ResumeDto {

    private String  jobName;
    private String  job_salary_min;
    private String  jobSalaryMax;
    private String  jobCategory;
    private String  jobEduc;
    private String  jobNature;
    private Date deliveryDate;//投递时间
}

package core.design.pojo.user;

import lombok.Data;

@Data
public class UserDetailDto {

    private Integer UserId;
    private String UserEmail;
    private String UserPwd;
    private Integer UserAttr;

}

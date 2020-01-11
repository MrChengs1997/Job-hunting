package core.design.util;

public class StatusCode {

    //注册状态返回码
    public   static Integer REG_ERR_FAIL_CODE = 0;//异常以及失败返回0
    public  static Integer REG_SUCCESS_CODE = 1;//注册成功返回1
    public  static Integer REG_EXIST = 2;//注册用户数据已经存在返回2

    //登陆状态码
    public  static  Integer LOG_SUCCESS_DOCE = 1;//密码正确
    public  static  Integer LOG_FAILD_DOCE = 0;//密码错误

    //修改密码状态返回码
    public  static  Integer UP_PWD_SUCCESS = 1;//修改成功
    public  static  Integer UP_PWD_FAILD = 0;//修改失败

    //检验当前用户是否已经绑定公司
    public  static  Integer COM_NOT_APP = 0;//没有申请绑定公司->0
    public  static  Integer COM_APP_APP = 1;//申请绑定公司正在审批->1
    public  static  Integer COM_APP_SUCCESS = 2;//申请通过->2


    //插入job数据返回状态码
    public  static  Integer JOB_SUCCESS = 1;//没有申请绑定公司->0
    public  static  Integer JOB_FAILD = 0;//申请绑定公司正在审批->1

    //job数据下线
    public  static  Integer JOB_OFF_SUCCESS = 1;//没有申请绑定公司->0
    public  static  Integer JOB_OFF_FAILD = 0;//申请绑定公司正在审批->1




}

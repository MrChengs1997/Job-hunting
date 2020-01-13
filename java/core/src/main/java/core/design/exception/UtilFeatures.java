package core.design.exception;

public class UtilFeatures {

    //注册失败
    public  static String REGISTER_CODE = "2001";
    public  static String REGISTER_CODE_DESC = "注册功能失败";


    //更改密码失败
    public  static String UP_PWD_CODE = "2002";
    public  static String UP_PWD_CODE_DESC = "更改密码接口失败";

    //根据员工email查询公司详情
    public static String COM_BY_USER_EMAIL_CODE ="2003";
    public static String COM_BY_USER_EMAIL_DESC ="根据员工email查询公司详情失败";

    //添加company信息
    public static String COM_ADD_CODE ="2004";
    public static String COM_ADD_DESC ="进行新增company数据出错";

    //查询指定用户下的所有数据
    public static String SEL_USER_JOB ="2005";
    public static String SEL_USER_JOB_CODE ="查询指定用户下的所有数据";

    //添加job
    public static String ADD_JOB_CODE ="2006";
    public static String ADD_JOB_DESC ="添加JOBDetail出错";

    //根据jobID进行删除指定的JobDetail数据
    public static String DEL_JOB_CODE ="2007";
    public static String DEL_JOB_DESC ="job下线失败";

    //根查询最新job20条失败
    public static String NEW_JOB_CODE ="2008";
    public static String NEW_JOB_DESC ="查询最新的20条job失败";

    //模糊查询job
    public static String LIKE_JOB_CODE ="2009";
    public static String LIKE_JOB_DESC ="根据serachname查询job失败";

    //根据用户id查询简历
    public static String RES_BY_USERID_CODE ="2010";
    public static String RES_BY_USERID_DESC ="根据用户id查询简历";



}

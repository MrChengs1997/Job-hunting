

CREATE TABLE `company_detail` (
  `com_id` int(3) NOT NULL AUTO_INCREMENT COMMENT '公司主键id,自增',
  `com_user_id` int(11) DEFAULT NULL COMMENT '绑定用户id',
  `com_whole_name` varchar(50) DEFAULT NULL COMMENT '公司全称',
  `com_short_name` varchar(30) DEFAULT NULL COMMENT '公司简称',
  `com_website` varchar(50) DEFAULT NULL COMMENT '公司网址',
  `com_location` varchar(10) DEFAULT NULL COMMENT '公司地址',
  `com_field` varchar(10) DEFAULT NULL COMMENT '公司领域',
  `com_size` varchar(20) DEFAULT NULL COMMENT '公司规模',
  `com_development` varchar(10) DEFAULT NULL COMMENT '公司发展阶段',
  `com_profile` varchar(255) DEFAULT NULL COMMENT '公司介绍',
  `com_ceo` varchar(10) DEFAULT NULL COMMENT '公司ceo',
  `com_auto` int(2) DEFAULT NULL COMMENT '认证阶段（0未认证，1已经认证）',
  PRIMARY KEY (`com_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

CREATE TABLE `delivery` (
  `job_id` int(3) DEFAULT NULL,
  `user_id` int(3) DEFAULT NULL,
  `del_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `del_code` int(4) NOT NULL DEFAULT '0' COMMENT '0:代处理  1：通知面试  2：不合格' 3：删除记录
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `job_detail` (
  `job_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键默认自增',
  `job_com_id` int(11) DEFAULT NULL COMMENT 'company绑定id',
  `job_user_id` int(11) DEFAULT NULL COMMENT '用户绑定id',
  `job_category` varchar(20) DEFAULT NULL COMMENT '职位类别',
  `job_name` varchar(20) DEFAULT NULL COMMENT '职位名称',
  `job_dept` varchar(20) DEFAULT NULL COMMENT '所属部门',
  `job_nature` varchar(20) DEFAULT NULL COMMENT '工作性质',
  `job_salary_min` int(4) DEFAULT NULL COMMENT '薪资最低',
  `job_salary_max` int(4) DEFAULT NULL COMMENT '薪资最高区间',
  `job_city` varchar(30) DEFAULT NULL COMMENT '工作城市',
  `job_exper` varchar(10) DEFAULT NULL COMMENT '工作经验',
  `job_educ` varchar(10) DEFAULT NULL COMMENT '学历',
  `job_desc` varchar(50) DEFAULT NULL COMMENT '公做描述',
  `job_exist` int(2) DEFAULT NULL COMMENT '0:下线 1：线上',
  `job_create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '上线时间',
  `job_end_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'x下线时间',
  `job_address` varchar(50) DEFAULT NULL COMMENT '详细地址',
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

CREATE TABLE `resume` (
  `res_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '简历id',
  `res_user_id` int(4) DEFAULT NULL COMMENT '绑定用户id',
  `res_name` varchar(10) DEFAULT NULL COMMENT '简历姓名',
  `res_sex` varchar(4) DEFAULT NULL COMMENT '简历性别',
  `res_educ` varchar(10) DEFAULT NULL COMMENT '简历学历',
  `res_expect_work` varchar(30) DEFAULT NULL COMMENT '简历期望工作',
  `res_work_exper` varchar(50) DEFAULT NULL COMMENT '工作经历',
  `res_project_exper` varchar(50) DEFAULT NULL COMMENT '项目经验',
  `res_works_addr` varchar(100) DEFAULT NULL COMMENT '作品地址',
  `res_phone` varchar(11) DEFAULT NULL COMMENT '联系方式',
  `res_desc` varchar(100) DEFAULT NULL COMMENT '自我描述',
  `res_work_year` varchar(100) DEFAULT NULL COMMENT '工作年限',
  `res_create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`res_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `user_detail` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户数据主键',
  `user_email` varchar(40) DEFAULT NULL COMMENT '用户邮箱',
  `user_pwd` varchar(40) DEFAULT NULL COMMENT '用户密码',
  `user_attr` int(2) DEFAULT NULL COMMENT '用户属性（0找工作&1招聘）',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='基本用户数据信息表';



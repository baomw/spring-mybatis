create table sys_user (
	id BIGINT not NULL auto_increment comment '用户id',
	user_name VARCHAR(50) comment '用户名',
	user_password VARCHAR(50) comment '用户密码',
	user_email VARCHAR(50) comment '邮箱',
	user_info text comment '简介',
	head_img blob comment '头像',
	create_time DATETIME COMMENT '创建时间',
	PRIMARY key (id)
) DEFAULT CHARSET=gbk;
alter table sys_user COMMENT '用户表';
create table sys_role(
	id BIGINT not NULL auto_increment comment '用户id',
	role_name VARCHAR(50) COMMENT '角色名称',
	enable int COMMENT '有效标识',
	create_by BIGINT COMMENT '创建人',
	create_time datetime COMMENT '创建时间',
	PRIMARY key (id)
)DEFAULT CHARSET=gbk;
ALTER table sys_role COMMENT '角色表'
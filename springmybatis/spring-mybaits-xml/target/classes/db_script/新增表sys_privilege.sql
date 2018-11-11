create table sys_privilege(
	id BIGINT not NULL auto_increment comment '用户id',
	privilege_name VARCHAR(50) COMMENT '权限名称',
	privilege_url VARCHAR(50) comment '权限URL',
	PRIMARY key (id)
)DEFAULT CHARSET=gbk;
ALTER table sys_privilege COMMENT '权限表'
create table sys_role_privilege(
	role_id BIGINT COMMENT '角色id',
	privilege_id BIGINT COMMENT '权限id'
)DEFAULT CHARSET=gbk;
ALTER table sys_role_privilege COMMENT '角色权限关联表'
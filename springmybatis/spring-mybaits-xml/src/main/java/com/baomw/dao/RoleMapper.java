package com.baomw.dao;

import com.baomw.domain.RoleDomain;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * 描述:
 * 角色处理dao类
 *
 * @author baomw
 * @create 2018-09-02 上午 10:39
 */
public interface RoleMapper {
    @Results({
            @Result(property ="id" ,column = "id"),
            @Result(property = "roleName",column = "user_name"),
            @Result(property = "enable",column = "enable"),
            @Result(property = "createBy",column = "create_by"),
            @Result(property = "createTime",column = "create_time")
        }
    )


    @Select("select * from sys_role where id=#{id}")
    public RoleDomain selectRoleById(String id);
}

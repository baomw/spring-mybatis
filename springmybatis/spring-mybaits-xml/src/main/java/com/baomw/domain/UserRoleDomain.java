package com.baomw.domain;

/**
 * 描述:
 * 用户-角色domain
 *
 * @author baomw
 * @create 2018-09-02 上午 12:00
 */
public class UserRoleDomain {
    /**
     *  用户id
     */
    private  int userId;
    /**
     *  角色id
     */
    private  int roleId;

    public int getUserId() {
        return userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}

package com.baomw.domain;

/**
 * 描述:
 * 角色-权限domain
 *
 * @author baomw
 * @create 2018-09-02 上午 12:01
 */
public class RolePrivilegeDomain {
    /**
     *  角色id
     */
   private int roleId;
    /**
     *  权限id
     */
   private int privilegeId;

    public int getRoleId() {
        return roleId;
    }

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }
}

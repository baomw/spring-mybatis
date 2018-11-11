package com.baomw.domain;

/**
 * 描述:
 * 权限domain
 *
 * @author baomw
 * @create 2018-09-01 下午 11:59
 */
public class PrivilegeDomain {
    /**
     * 主键id
     */
    private int id;
    /**
     * 权限名称
     */
    private String privilegeName;
    /**
     * 权限URL
     */
    private String getPrivilegeUrl;

    public int getId() {
        return id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public String getGetPrivilegeUrl() {
        return getPrivilegeUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public void setGetPrivilegeUrl(String getPrivilegeUrl) {
        this.getPrivilegeUrl = getPrivilegeUrl;
    }
}

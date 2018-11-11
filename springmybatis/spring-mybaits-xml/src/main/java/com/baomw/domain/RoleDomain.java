package com.baomw.domain;

import java.util.Date;

/**
 * 描述:
 * 角色domain
 *
 * @author baomw
 * @create 2018-09-01 下午 11:59
 */
public class RoleDomain {
    /**
     * 主键id
     */
    private int id;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 有效标志
     */
    private int enable;
    /**
     * 创建人
     */
    private String createBy;
    /**
     *  创建时间
     */
    private Date createTime;

    public int getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }

    public int getEnable() {
        return enable;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

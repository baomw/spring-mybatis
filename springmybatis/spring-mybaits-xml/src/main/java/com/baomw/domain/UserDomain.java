package com.baomw.domain;

import java.util.Date;
/**
 * 描述:
 * 用户domain
 *
 * @author baomw
 * @create 2018-09-01 下午 11:58
 */
public class UserDomain {
    /**
     *  用户id
     */
    private int id;
    /**
     *  用户名
     */
    private String userName;
    /**
     *  密码
     */
    private String userPassword;
    /**
     *  邮箱
     */
    private String userEmail;
    /**
     *  简介
     */
    private String userInfo;
    /**
     *  头像
     */
    private byte[] userImg;
    /**
     *  创建时间
     */
    private Date createTime;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public byte[] getUserImg() {
        return userImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setUserImg(byte[] userImg) {
        this.userImg = userImg;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

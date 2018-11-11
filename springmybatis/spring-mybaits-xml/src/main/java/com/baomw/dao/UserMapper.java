package com.baomw.dao;

import com.baomw.domain.UserDomain;

import java.util.List;

/**
 * 描述:
 * 人员处理dao类
 *
 * @author baomw
 * @create 2018-09-02 上午 10:40
 */
public interface UserMapper {

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    public UserDomain selectUserById(String id);
}

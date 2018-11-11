package com.baomw.service;

import com.baomw.dao.UserMapper;
import com.baomw.domain.UserDomain;
import com.baomw.util.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

/**
 * 描述:
 * 用户服务类
 *
 * @author baomw
 * @create 2018-09-02 上午 11:09
 */
public class UserService {
    private SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    Logger logger = Logger.getLogger("UserService");

    public UserDomain selectUserById(String id){
        SqlSession sqlSession = sqlSessionFactoryBean.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserDomain domain = mapper.selectUserById("1");
        return domain;
    }

    @Test
    public void test(){
        UserDomain domain = this.selectUserById("1");
            //logger.info(domain.getId());
            logger.info(domain.getUserName());
            logger.info(domain.getUserPassword());
            logger.info(domain.getUserEmail());
            logger.info(domain.getUserInfo());
           //logger.info(domain.getCreateTime());
    }
}

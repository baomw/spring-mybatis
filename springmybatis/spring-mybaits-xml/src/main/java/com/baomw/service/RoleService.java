package com.baomw.service;

import com.baomw.dao.RoleMapper;
import com.baomw.domain.RoleDomain;
import com.baomw.util.SqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 描述:
 * 角色服务类
 *
 * @author baomw
 * @create 2018-09-02 上午 11:43
 */
public class RoleService {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    Logger logger = Logger.getLogger("RoleService");


    @Test
    public void getRole(){
        SqlSession sqlSession = sqlSessionFactoryBean.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        RoleDomain domain = mapper.selectRoleById("1");
        logger.info(domain.getId());
        logger.info(domain.getRoleName());
        logger.info(domain.getCreateBy());
        logger.info(domain.getCreateTime());
        logger.info(domain.getEnable());
    }
}

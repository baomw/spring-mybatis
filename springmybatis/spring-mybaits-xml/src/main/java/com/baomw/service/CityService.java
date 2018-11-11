package com.baomw.service;

import com.baomw.domain.CityDomain;
import com.baomw.util.SqlSessionFactoryBean;
import com.baomw.domain.CityDomain;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * 描述:
 * 城市服务类
 *
 * @author baomw
 * @create 2018-08-30 下午 11:43
 */
public class CityService {

    private SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

    public List<CityDomain> selectCityById(String id){
        SqlSession sqlSession = null;
        List<CityDomain> list = null;
        try {
            sqlSession = sqlSessionFactoryBean.getSqlSession();
            list = sqlSession.selectList("com.baomw.dao.CityMapper.selectCityById",id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

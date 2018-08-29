package com.baomw.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 数据连接dao类
 *
 * @author baomw
 * @create 2018-08-29 下午 10:10
 */
@Repository
public interface CityDao {

    @Select("select * from city")
    public List<Map<Object,Object>> query();

    @Select("select * from city where id=#{id}")
    public List<Map<Object,Object>> queryById(String id);
}

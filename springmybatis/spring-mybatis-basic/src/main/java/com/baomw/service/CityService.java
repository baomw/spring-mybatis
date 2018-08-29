package com.baomw.service;

import com.baomw.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 数据连接服务类
 *
 * @author baomw
 * @create 2018-08-29 下午 10:12
 */
@Service
public class CityService {

    @Autowired
    CityDao dao;
    public List<Map<Object,Object>> query(){
        return dao.query();
    }

    public List<Map<Object,Object>> queryById(String id){
        return dao.queryById(id);
    }
}

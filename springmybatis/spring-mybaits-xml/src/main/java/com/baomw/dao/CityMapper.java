package com.baomw.dao;

import com.baomw.domain.CityDomain;

/**
 * 描述:
 * 城市服务类
 *
 * @author baomw
 * @create 2018-09-01 下午 9:19
 */
public interface CityMapper {

    /**
     * 根据id获取城市信息
     * @param id
     * @return
     */
    public CityDomain selectCityById(String id);
}

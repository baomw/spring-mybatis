package com.baomw;

import com.baomw.domain.CityDomain;
import com.baomw.service.CityService;

import java.util.List;

/**
 * 描述:
 * 基于xml配置的mybatis测试类
 *
 * @author baomw
 * @create 2018-08-30 下午 11:02
 */
public class test {

    public static void main(String[] args) {
        CityService service = new CityService();
        List<CityDomain> list = service.selectCityById("6");
        for (CityDomain domain:list){
            System.out.println(domain.getId());
            System.out.println(domain.getName());
            System.out.println(domain.getProvice());
        }
    }
}

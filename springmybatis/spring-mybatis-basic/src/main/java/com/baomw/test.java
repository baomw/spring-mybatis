package com.baomw;

import com.baomw.config.AppConfig;
import com.baomw.service.CityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * 描述:
 * 测试类
 *
 * @author baomw
 * @create 2018-08-29 下午 10:16
 */
public class test {
    /**
     * spring基于0配置整合mybatis
     * 需要依赖：
     *      spring-context   spring工作环境
     *      mybatis          mybatis工作环境
     *      mybatis-spring   mybatis整合spring
     *      spring-jdbc      引用spring数据源
     *      mysql-connector-java    mysql数据库连接驱动包
     * @param args
     */



    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        CityService cityService = ac.getBean(CityService.class);
        //List list1 = cityService.query();

        List list2 = cityService.queryById("6");
        System.out.println(list2);
    }
}

package com.baomw.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * 描述:
 * spring-context服务类
 *
 * @author baomw
 * @create 2018-08-29 下午 12:25
 */
@Configuration
@ComponentScan("com.baomw")
@MapperScan("com.baomw.dao")
public class AppConfig {

    /**
     * 数据源驱动
     * @param dataSource
     * @return
     */
    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //这是在使用MySQL 8.0以上版本（MySQL连接驱动和版本都是8.0以上）的时候出现的问题错误，
        // 我们需要在访问数据库的Url后面加上以下的语句即可：
        //?serverTimezone=GMT%2B8
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/baomwstudy?serverTimezone=GMT%2B8");
        driverManagerDataSource.setUsername("baomw");
        driverManagerDataSource.setPassword("baomw");
        return driverManagerDataSource;
    }
}

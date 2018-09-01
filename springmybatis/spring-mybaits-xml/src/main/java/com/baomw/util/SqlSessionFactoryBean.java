package com.baomw.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 描述:
 * sqlsession工厂类
 *
 * @author baomw
 * @create 2018-08-30 下午 11:27
 */
public class SqlSessionFactoryBean {

    private static SqlSessionFactory sqlSessionFactory ;

    public SqlSession getSqlSession() throws IOException {
        //try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
       // }catch (IOException e){
       // }
        return sqlSessionFactory.openSession();
    }
}

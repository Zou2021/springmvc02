package com.springmvc.tools;

/**
 * @author:邹祥发
 * @date：2021-05-27 11:34
 **/

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class BackSession {

    public static SqlSession getSession(String MapperConfig) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream(MapperConfig);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        return sqlSessionFactory.openSession(true);

    }

}


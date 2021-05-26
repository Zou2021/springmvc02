package com.springmvc.tools;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author:王娉
 * @date：2021-05-21 22:06
 **/
public class C3p0Comm {
    public static Connection getConnection() throws Exception{
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\15654\\Desktop\\springmvc02\\src\\main\\resources\\c3p0.properties");
        Properties properties=new Properties();
        properties.load(fileInputStream);

        String driver=properties.getProperty("driverClassName");
        String url=properties.getProperty("url");
        String username=properties.getProperty("username");
        String password=properties.getProperty("password");

        ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(username);
        comboPooledDataSource.setPassword(password);

        return comboPooledDataSource.getConnection();
    }
}

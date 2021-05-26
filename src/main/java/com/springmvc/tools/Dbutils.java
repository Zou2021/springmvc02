package com.springmvc.tools;

import com.springmvc.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author:王娉
 * @date：2021-05-24 08:48
 **/
public class Dbutils {
    Connection connection = null;

    //添加数据到数据库
    public void addUser(User user) throws Exception {
        connection = C3p0Comm.getConnection();
        String sql = "insert into user(name,age,sex) VALUES (?,?,?)";
        QueryRunner queryRunner = new QueryRunner();
        int count = queryRunner.update(connection, sql, user.getName(), user.getAge(),user.getSex());
        System.out.println("插入" + count + "成功！");
    }

    //删除数据
    public void deluser(Integer id) throws Exception {
        connection = C3p0Comm.getConnection();
        String sql = "DELETE FROM user WHERE id=?";
        QueryRunner queryRunner = new QueryRunner();
        int count = queryRunner.update(connection, sql, id);
        System.out.println("删除" + count + "数据成功！");
    }

    //修改数据
    public void upuser(User user, int id) throws Exception {
        connection = C3p0Comm.getConnection();
        String sql = "UPDATE user SET name=?,age=?,sex=? WHERE id=?";
        QueryRunner queryRunner = new QueryRunner();
        int count = queryRunner.update(connection, sql, user.getName(), user.getAge(),user.getSex(),id);
        System.out.println("修改" + count + "数据成功！");
    }

    //查询数据
    public List<User> selectuser() throws Exception {
        connection = C3p0Comm.getConnection();
        String sql = "SELECT * FROM user";
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, sql, new BeanListHandler<User>(User.class));
    }

    //根据条件查询
    public User selectuser(Integer id) throws Exception {
        connection = C3p0Comm.getConnection();
        String sql = "SELECT * FROM user WHERE id=?";
        QueryRunner queryRunner = new QueryRunner();
        return queryRunner.query(connection, sql, new BeanHandler<User>(User.class),id);
    }

}

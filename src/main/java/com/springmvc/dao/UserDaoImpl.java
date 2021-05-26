package com.springmvc.dao;

import com.springmvc.pojo.User;
import com.springmvc.tools.Dbutils;

import java.util.List;

/**
 * @author:王娉
 * @date：2021-05-24 15:18
 **/
public class UserDaoImpl implements UserDao {
    Dbutils dbutils=new Dbutils();
    @Override
    public void addUser(User user) throws Exception {
        dbutils.addUser(user);
    }

    @Override
    public void deluser(Integer id) throws Exception {
        dbutils.deluser(id);
    }

    @Override
    public void updateUser(User user, Integer id) throws Exception {
        dbutils.upuser(user,id);
    }

    @Override
    public List<User> selectUser() throws Exception {
        return dbutils.selectuser();
    }

    @Override
    public User selectUserById(Integer id) throws Exception {
        return dbutils.selectuser(id);
    }
}

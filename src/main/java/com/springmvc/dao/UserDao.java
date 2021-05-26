package com.springmvc.dao;

import com.springmvc.pojo.User;

import java.util.List;

public interface UserDao {
    void addUser(User user) throws Exception;

    void deluser(Integer id) throws Exception;

    void updateUser(User user,Integer id) throws Exception;

    List<User> selectUser() throws Exception;

    User selectUserById(Integer id) throws Exception;

}

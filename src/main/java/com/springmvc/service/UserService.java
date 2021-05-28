package com.springmvc.service;

import com.springmvc.pojo.User;

import java.util.List;

/**
 * @author:邹祥发
 * @date：2021-05-24 15:28
 **/
public interface UserService {
    void addUserSer(User user) throws Exception;

    void deluserSer(Integer id) throws Exception;

    void updateMyUserSer(User user) throws Exception;

    List<User> selectUserSer() throws Exception;

    User selectUserByIdSer(Integer id) throws Exception;
}

package com.springmvc.service;

import com.springmvc.dao.UserDaoImpl;
import com.springmvc.pojo.User;

import java.util.List;

/**
 * @author:王娉
 * @date：2021-05-24 15:31
 **/
public class UserServiceImpl implements UserService {
    UserDaoImpl userDaoImpl=new UserDaoImpl();
    @Override
    public void addUserSer(User user) throws Exception {
        userDaoImpl.addUser(user);
    }

    @Override
    public void deluserSer(Integer id) throws Exception {
        userDaoImpl.deluser(id);
    }

    @Override
    public void updateUserSer(User user, Integer id) throws Exception {
        userDaoImpl.updateUser(user,id);
    }

    @Override
    public List<User> selectUserSer() throws Exception {
        return userDaoImpl.selectUser();
    }

    @Override
    public User selectUserByIdSer(Integer id) throws Exception {
        return userDaoImpl.selectUserById(id);
    }
}

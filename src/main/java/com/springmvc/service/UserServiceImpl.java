package com.springmvc.service;

import com.springmvc.dao.UserDaoImpl;
import com.springmvc.mapper.UserMapper;
import com.springmvc.pojo.User;
import com.springmvc.tools.BackSession;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * @author:邹祥发
 * @date：2021-05-24 15:31
 **/
public class UserServiceImpl implements UserService {
    UserDaoImpl userDaoImpl=new UserDaoImpl();

    public static UserMapper userMapper=null;
    static {
        SqlSession session;
        try {
            session= BackSession.getSession("config.xml");
            userMapper=session.getMapper(com.springmvc.mapper.UserMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void addUserSer(User user) throws Exception {
        userDaoImpl.addUser(user);
    }

    @Override
    public void deluserSer(Integer id) throws Exception {
        userDaoImpl.deluser(id);
    }

    @Override
    public void updateMyUserSer(User user) throws Exception {
        userMapper.updateMyUser(user);
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

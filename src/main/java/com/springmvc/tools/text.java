package com.springmvc.tools;

import com.springmvc.pojo.User;

import java.util.List;

/**
 * @author:王娉
 * @date：2021-05-21 22:59
 **/
public class text {
    public static void main(String[] args) throws Exception {
        Dbutils dbutils=new Dbutils();
//        User user=new User();
//        user.setName("wxy");
//        user.setAge(10);
//        dbutils.addUser(user);

        List<User> list=dbutils.selectuser();
        for(User user:list){
            System.out.println(user.getName());
        }
    }

}
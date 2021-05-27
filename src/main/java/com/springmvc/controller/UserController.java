package com.springmvc.controller;

import com.springmvc.pojo.User;
import com.springmvc.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author:王娉
 * @date：2021-05-21 21:29
 **/
@Controller
public class UserController {
    UserServiceImpl userServiceImpl = new UserServiceImpl();

    //所有的数据页面展示
    @RequestMapping("/getUser.do")
    public ModelAndView getUser() throws Exception {
        System.out.println("你已经进入到controller了!!然后获取你的所有数据库的信息");
        List<User> list = userServiceImpl.selectUserSer();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("userlist.jsp");
        return modelAndView;
    }

    //添加方法（跳转页面）
    @RequestMapping("/add.do")
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add.jsp");

        return modelAndView;
    }

    //添加方法（设置数据）
    @RequestMapping("/addUser.do")
    public String add(String name, Integer age, String sex) throws Exception {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        userServiceImpl.addUserSer(user);

        return "redirect:getUser.do";
    }

    //删除方法
    @RequestMapping("/del.do")
    public String delUser(Integer id) throws Exception {
        userServiceImpl.deluserSer(id);

        return "getUser.do";
    }
    //修改方法（跳转页面）
    @RequestMapping("/edit.do")
    public ModelAndView up(Integer id)throws Exception{
        System.out.println("请求修改方法");
        User user = userServiceImpl.selectUserByIdSer(id);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("edit.jsp");
        return modelAndView;
    }
    //修改方法（更新数据）
    @RequestMapping("/editUser.do")
    public String edit(Integer id,String name,Integer age,String sex)throws Exception{
        System.out.println("进入到数据库修改方法");
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        userServiceImpl.updateUserSer(user,id);

        return "redirect:getUser.do";
    }
}
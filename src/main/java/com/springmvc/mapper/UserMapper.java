package com.springmvc.mapper;

import com.springmvc.pojo.User;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

    @Update("update user set name=#{name},age=#{age},sex=#{sex} where id=#{id}")
    void updateMyUser(User user) throws Exception;
}

package com.yidianbuhui.ccshop.dao;

import com.yidianbuhui.ccshop.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    User selectByUser(User user);

    User getUser(Integer id);

    int addUser(User user);

    int updateUser(User user);
}
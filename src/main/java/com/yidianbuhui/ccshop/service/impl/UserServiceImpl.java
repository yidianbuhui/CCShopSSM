package com.yidianbuhui.ccshop.service.impl;

import com.yidianbuhui.ccshop.dao.UserMapper;
import com.yidianbuhui.ccshop.entity.User;
import com.yidianbuhui.ccshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.selectByUser(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

}

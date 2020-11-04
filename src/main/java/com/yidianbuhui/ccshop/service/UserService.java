package com.yidianbuhui.ccshop.service;

import com.yidianbuhui.ccshop.entity.User;

public interface UserService {
    User login(User user);//登录

    int addUser(User user);

    int updateUser(User user);

    User getUser(Integer id);
}

package com.lc.service.impl;

import com.lc.bean.User;
import com.lc.dao.UserDao;
import com.lc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liuchao on 2018/6/7.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}

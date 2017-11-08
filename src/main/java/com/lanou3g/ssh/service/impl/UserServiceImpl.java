package com.lanou3g.ssh.service.impl;

import com.lanou3g.ssh.dao.UserDao;
import com.lanou3g.ssh.domain.User;
import com.lanou3g.ssh.service.UserService;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/8.
 */
public class UserServiceImpl implements UserService {



    private UserDao userDao;
    @Override
    public User register(User user) {
        return userDao.register(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

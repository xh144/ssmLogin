package com.qf.log.service.impl;

import com.qf.log.mapper.UserMapper;
import com.qf.log.model.User;
import com.qf.log.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User UserLogin(User user) {
        return userMapper.query(user);
    }
}

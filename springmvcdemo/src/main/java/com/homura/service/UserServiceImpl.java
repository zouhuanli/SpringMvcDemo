package com.homura.service;

import com.homura.dao.UserMapper;
import com.homura.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userDao;

    public List<User> findUserList() {
        return userDao.findUserList();
    }
}

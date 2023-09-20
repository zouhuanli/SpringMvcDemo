package com.homura.service;

import com.homura.dao.UserMapper;
import com.homura.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务
 * @author zouhl
 */
@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userDao;

    /**
     * 查找用户列表
     *
     * @return
     */
    public List<User> findUserList() throws Exception {
        return userDao.findUserList();
    }
}

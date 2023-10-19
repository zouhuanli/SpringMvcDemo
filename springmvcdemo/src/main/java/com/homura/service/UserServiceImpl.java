package com.homura.service;

import com.homura.dao.UserMapper;
import com.homura.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户服务
 *
 * @author zouhl
 */
@Service
public class UserServiceImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
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

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int addUser(User user) {
        LOGGER.info("add user:{}", user);
        int n = userDao.addUser(user);
        LOGGER.info("add user result:{}", n);
        return n;
    }
}

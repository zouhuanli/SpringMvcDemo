package com.homura.dao;

import com.homura.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DAO
 *
 * @author zouhl
 */
@Repository
public interface UserMapper {
    /**
     * 查找全部用户
     * <p>
     * 不要使用 select  *
     *
     * @return
     */
    @Select("select * from user")
    @ResultMap("BaseResultMap")
    List<User> findUserList();

    /**
     * 添加用户
     *
     * @param user 用户
     * @return
     */
    @Insert(" insert  into user (uid,uname,password,gender,phone,email,address) " +
            " values " +
            " (#{user.uid},#{user.uname},#{user.password},#{user.gender},#{user.phone},#{user.email},#{user.address})")
    @ResultType(int.class)
    int addUser(@Param("user") User user);
}

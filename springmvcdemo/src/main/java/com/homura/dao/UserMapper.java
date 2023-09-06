package com.homura.dao;

import com.homura.entity.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 查找全部用户
     *
     * @return
     */
    @Select("select * from user")
    @ResultMap("BaseResultMap")
    List<User> findUserList();

}

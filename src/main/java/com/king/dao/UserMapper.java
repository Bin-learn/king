package com.king.dao;

import com.king.pojo.User;
import com.king.vo.KingAndWish;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUserMessage(String username);

    User CheckPassword(@Param("username")String username, @Param("password")String password);


}
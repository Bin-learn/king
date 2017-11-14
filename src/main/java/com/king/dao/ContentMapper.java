package com.king.dao;

import com.king.pojo.Content;
import org.apache.ibatis.annotations.Param;

public interface ContentMapper {
    int insert(Content record);

    int insertSelective(Content record);

    int save(@Param("label") String label, @Param("content")String content, @Param("username")String username, @Param("isOpen")Integer isOpen);
}
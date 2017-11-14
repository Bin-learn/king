package com.king.dao;

import com.king.pojo.KingAngle;

public interface KingAngleMapper {
    int insert(KingAngle record);

    int insertSelective(KingAngle record);

    KingAngle getKingAngle(String username);
}
package com.king.dao;

import com.king.pojo.KingAngle;
import com.king.vo.KingAndWish;

public interface KingAngleMapper {
    int insert(KingAngle record);

    int insertSelective(KingAngle record);

    KingAngle getKingAngle(String username);
}
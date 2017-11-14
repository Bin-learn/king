package com.king.service;

import com.king.common.ResponseFormat;
import com.king.pojo.KingAngle;
import com.king.pojo.User;
import com.king.vo.KingAndWish;

/**
 * Created by  bin
 * Time： 2017/11/10.
 */
public interface UserService {
    ResponseFormat<User> login(String username, String password);

    ResponseFormat<KingAngle> king_wish(String username);
}

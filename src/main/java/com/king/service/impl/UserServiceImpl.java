package com.king.service.impl;

import com.king.common.ResponseFormat;
import com.king.dao.KingAngleMapper;
import com.king.dao.UserMapper;
import com.king.pojo.KingAngle;
import com.king.pojo.User;
import com.king.service.UserService;
import com.king.vo.KingAndWish;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by  bin
 * Time： 2017/11/10.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private KingAngleMapper kingAngleMapper;

    @Override
    public ResponseFormat<User> login(String username, String password) {
        int resultCount = userMapper.checkUserMessage(username);
        if(resultCount==0){
            return ResponseFormat.createByErrorMessage("嘿嘿，是不是您的大名写错了呀！");
        }

        User user = userMapper.CheckPassword(username,password);
        if (user == null){
            return ResponseFormat.createByErrorMessage("真是遗憾，密码错了！");
        }

        //将密码置为空
        user.setPassword(StringUtils.EMPTY);
        return ResponseFormat.createBySuccess("登录成功",user);
    }

    @Override
    public ResponseFormat<KingAngle> king_wish(String username) {
        KingAngle kingAngle = kingAngleMapper.getKingAngle(username);
//        if(kingAngle.getWish()==null){
//            kingAngle.setWish("你的国王把愿望丢了！");
//        }
        return ResponseFormat.createBySuccess(kingAngle);
    }
}

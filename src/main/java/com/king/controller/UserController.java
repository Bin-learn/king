package com.king.controller;

import com.king.common.Const;
import com.king.common.ResponseFormat;
import com.king.pojo.KingAngle;
import com.king.pojo.User;
import com.king.service.UserService;
import com.king.vo.KingAndWish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by  bin
 * Time： 2017/11/10.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="login.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseFormat<User> login(String username, String password, HttpSession session){
        ResponseFormat<User> response = userService.login(username,password);
        if(response.isSuccess()){

            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    @RequestMapping(value="kingWish.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseFormat<KingAngle> king_wish(String username){
//        if(username == null){
//            return ResponseFormat.createByErrorMessage("用户未登录，请先登录！");
//        }
        ResponseFormat<KingAngle> response = userService.king_wish(username);
        return response;
    }
}

package com.king.controller;

import com.github.pagehelper.PageInfo;
import com.king.common.Const;
import com.king.common.ResponseFormat;
import com.king.pojo.User;
import com.king.service.ShudongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by  bin
 * Time： 2017/11/14.
 */
@Controller
@RequestMapping("/shudong/")
public class ShudongController {

    @Autowired
    private ShudongService shudongService;

    @RequestMapping(value="fabiao.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseFormat<String> save(String label, String content, Integer isOpen, HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ResponseFormat.createByErrorMessage("用户未登录，请先登录！");
        }
        ResponseFormat<String> response = shudongService.save(label,content,user.getUsername(), isOpen);
        if(response.isSuccess()){

            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    @RequestMapping(value="getContent.do",method = RequestMethod.POST)
    @ResponseBody
    public ResponseFormat<PageInfo> getContent(Integer pageNo){

        ResponseFormat<PageInfo> response = shudongService.getContent(pageNo);

        return response;
    }
}

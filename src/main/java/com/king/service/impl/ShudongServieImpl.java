package com.king.service.impl;

import com.king.common.ResponseFormat;
import com.king.dao.ContentMapper;
import com.king.pojo.Content;
import com.king.pojo.User;
import com.king.service.ShudongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by  bin
 * Time： 2017/11/14.
 */
@Service
public class ShudongServieImpl implements ShudongService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public ResponseFormat<String> save(String label, String content, String username, Integer isOpen) {

        int count = contentMapper.save(label, content, username, isOpen);
        if (count>0){
            return ResponseFormat.createBySuccessMessage("发布成功！");
        }
        return ResponseFormat.createBySuccessMessage("发布失败！");
    }
}

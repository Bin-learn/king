package com.king.service;

import com.king.common.ResponseFormat;
import com.king.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by  bin
 * Time： 2017/11/14.
 */
public interface ShudongService {
    ResponseFormat<String> save(String label, String content, String username, Integer isOpen);
}

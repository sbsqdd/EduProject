package com.yuxiu.edu.service;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.base.IBaseService;

/**
 * @author GeZhiGuang
 * @version 0.1
 * @date 2020/7/31
 */
public interface IUserService extends IBaseService<User> {

    //特有的方法
    public User login(String username, String password);
}

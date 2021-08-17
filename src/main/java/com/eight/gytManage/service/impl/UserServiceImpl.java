package com.eight.gytManage.service.impl;

import com.eight.gytManage.mapper.IUserMapper;
import com.eight.gytManage.pojo.User;
import com.eight.gytManage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Kele-Bing
 * @Create 2021/8/14 11:36
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper userMapper;
    
    @Override
    public User queryUserByUsernameAndPassword(User user) {
        return userMapper.queryUserByUsernameAndPassword(user);
    }
}

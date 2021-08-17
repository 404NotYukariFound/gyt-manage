package com.eight.gytManage.controller;

import com.eight.gytManage.pojo.User;
import com.eight.gytManage.service.IUserService;
import com.eight.gytManage.utils.ResultMapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @Author Kele-Bing
 * @Create 2021/8/14 11:37
 * @Version 1.0
 */
@Controller
@RequestMapping("/eight")
public class UserController {
    @Autowired
    private IUserService userService;
    
    @RequestMapping("loginning")
    @ResponseBody
    public HashMap<String,Object> login(User user){
        System.out.println(user);
        User user1 = userService.queryUserByUsernameAndPassword(user);
        return ResultMapUtils.singleResult(user1);
    }
    
}

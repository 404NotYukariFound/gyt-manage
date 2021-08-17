package com.eight.gytManage.mapper;

import com.eight.gytManage.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author Kele-Bing
 * @Create 2021/8/14 11:36
 * @Version 1.0
 */
@Mapper
@Repository
public interface IUserMapper {

    User queryUserByUsernameAndPassword(User user);
}

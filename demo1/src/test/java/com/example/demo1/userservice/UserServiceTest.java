package com.example.demo1.userservice;

import com.example.demo1.pojo.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Autowired
    private UserService userService ;

    private Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Test
    void findAll() {

       List<User> list = userService.findAll();
        for (User user:list) {
            System.out.println(user);
        }
        if(list!=null){
            logger.info (" UserServiceTest-findall -查询全部" );
        }
       else
        {
            logger.info (" UserServiceTest-findall -查询失败" );
        }

    }

    @Test
    void addUser() {
    User user = new User();
    user.setId(5);
    user.setName("哈哈");
    userService.addUser(user);
    logger.info (" UserServiceTest-addUser- 添加成功-{}{}" ,user.getId(),user.getName());

    }

    @Test
    void updateUser() {
        User user = userService.findById(2);
        user.setId(5);
        user.setName("哈哈");
        userService.updateUser(user);
        logger.info (" UserServiceTest-updateUser- 修改2号成功-{}{}" ,user.getId(),user.getName());
    }

    @Test
    void deleteUser() {
        userService.deleteUser(2);
        logger.info (" UserServiceTest-deleteUser -删除2号" );

    }

    @Test
    void findById() {
       User user=  userService.findById(2);
       if(user!=null){
           logger.info (" UserServiceTest-findById- 查找2号成功-{}{}" ,user.getId(),user.getName());
       }else
       {
           logger.info (" UserServiceTest-findById- 查找2号失败");
       }

    }
}
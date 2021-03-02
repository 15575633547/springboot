package com.example.demo1.userservice;

import java.util.List;

import com.example.demo1.mapper.UserMapper;
import com.example.demo1.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(UserService.class);



    /**
     * 获取全部的用户
     * @return
     */
    public List<User> findAll() {
        logger.info (" UserService-findall -查询全部" );
        return userMapper.findAll();

    }

    /**
     * 添加用户
     * @param user
     */
    @Transactional
    public void addUser(User user) {

        logger.info (" UserService-addUser- 添加成功-{}{}" ,user.getId(),user.getName());
        userMapper.addUser(user);
}

    /**
     * 修改用户
     * @param user
     */
    @Transactional
    public void updateUser(User user)
    {
        logger.info (" UserService-updateUser- 修改成功-{}{}" ,user.getId(),user.getName());
        userMapper.updateUser(user);
    }

    /**
     * 删除用户
     * @param id
     */
    @Transactional
    public void deleteUser(int id) {

        logger.info (" UserService-deleteUser -删除" );
        userMapper.deleteUser(id);
    }

    /**
     * 查询指定用户
     * @param id
     * @return
     */
    public User findById(int id) {

        logger.info (" UserService-findById- 查找成功-{}{}" );
        return userMapper.findById(id);
    }
}
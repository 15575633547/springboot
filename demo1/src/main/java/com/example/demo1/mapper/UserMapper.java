package com.example.demo1.mapper;

import java.util.List;

import com.example.demo1.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;


@Mapper
@Service
public interface UserMapper {
    /**
     * 全部用户查询
     * @return
     */
    @Select("SELECT ID FROM T_USER")
    List<User> findAll();

    /**
     * 新增用户
     */
    @Insert("INSERT INTO T_USER(NAME)VALUES(#{name})")
    void addUser(User user);

    /**
     * 修改用户
     */
    @Update("UPDATE T_USER SET NAME=#{name}WHERE ID=#{id}")
    void updateUser(User user);

    /**
     * 删除用户
     */
    @Delete("DELETE FROM USER WHERE ID=#{id}")
    void deleteUser(int id);

    @Select("SELECT ID,NAME FROM T_USER WHERE ID=#{id}")
    User findById(@Param("id")int id);
}
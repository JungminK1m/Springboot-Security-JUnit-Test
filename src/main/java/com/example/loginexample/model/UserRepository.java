package com.example.loginexample.model;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.loginexample.dto.UserReq.JoinReqDto;
import com.example.loginexample.dto.UserReq.LoginReqDto;

@Mapper
public interface UserRepository {
    public int insert(@Param("username") String username, @Param("password") String pasword,
            @Param("email") String email);

    public int updateById(User user);

    public int deleteById(int id);

    public List<User> findAll();

    public User findById(int id);

    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String pasword);

}

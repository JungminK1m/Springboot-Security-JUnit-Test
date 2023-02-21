package com.example.loginexample.model;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.loginexample.dto.UserReq.JoinReqDto;
import com.example.loginexample.dto.UserReq.LoginReqDto;

@Mapper
public interface UserRepository {

    public List<User> findAll();

    public User findById(int id);

    public User findByUsernameAndPassword(LoginReqDto loginReqDto);

    public int insert(JoinReqDto joinReqDto);

    public int deleteById(int id);

    public int updateById(User user);
}

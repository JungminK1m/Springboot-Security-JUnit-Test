package com.example.loginexample.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

@MybatisTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAll_test() throws Exception {
        // given
        ObjectMapper om = new ObjectMapper(); // Jackson

        // when
        List<User> JoinReqDto = userRepository.findAll();
        String responseBody = om.writeValueAsString(JoinReqDto);
        System.out.println("테스트 : " + responseBody);

        // then
        assertThat(JoinReqDto.get(1).getUsername());
        assertThat(JoinReqDto.get(1).getPassword());
    }

}

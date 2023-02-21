package com.example.loginexample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.loginexample.dto.UserReq.JoinReqDto;
import com.example.loginexample.handler.exception.CustomException;
import com.example.loginexample.model.UserRepository;
import com.example.loginexample.security.PasswordEncoder;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void 회원가입(JoinReqDto joinReqDto) {
        int result = userRepository.insert(joinReqDto.getUsername(), PasswordEncoder.encode(joinReqDto.getPassword()),
                joinReqDto.getEmail());
        if (result != 1) {
            throw new CustomException("회원가입 실패", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

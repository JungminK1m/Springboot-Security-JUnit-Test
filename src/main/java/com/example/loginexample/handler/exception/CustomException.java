package com.example.loginexample.handler.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

    private HttpStatus status;

    // 생성자
    public CustomException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}

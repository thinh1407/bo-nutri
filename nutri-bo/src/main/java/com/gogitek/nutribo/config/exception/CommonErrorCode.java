package com.gogitek.nutribo.config.exception;

import org.springframework.http.HttpStatus;

public interface CommonErrorCode {
    String code();

    HttpStatus status();

    String message();
}

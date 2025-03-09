package com.streetfoodtruck.controller.exception;

import lombok.Getter;

@Getter
public enum BusinessError {

    // POST 4000 ~ 4999번대
    DUPLICATE_LIKE_ERROR(4000, "예외 테스트");
    private final int code;
    private final String message;

    BusinessError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException exception() {
        return new BusinessException(this.code, this.message);
    }
}

package com.streetfoodtruck.controller.exception;

import com.streetfoodtruck.controller.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public ApiResponse<Void> BusinessExceptionHandler(BusinessException e) {
        return ApiResponse.businessException(e.getCode(), e.getMessage());
    }

}

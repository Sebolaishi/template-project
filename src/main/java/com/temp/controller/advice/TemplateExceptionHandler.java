package com.temp.controller.advice;

import com.temp.constants.TemplateErrorCode;
import com.temp.dto.ErrorResponse;
import com.temp.exception.TemplateException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class TemplateExceptionHandler {

    @ExceptionHandler(value = TemplateException.class)
    public ResponseEntity<ErrorResponse> templateException(TemplateException exception) {
        log.error("templateException - handled templateException", exception);
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(exception.getErrorCode().getDescription())
                .errorCode(exception.getErrorCode())
                .build();
        return new ResponseEntity<>(errorResponse, exception.getErrorCode().getHttpStatus());
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        log.error("handleException - handled generic Exception", e);
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(e.getMessage())
                .errorCode(TemplateErrorCode.GENERAL_ERROR)
                .build();
        return new ResponseEntity<>(errorResponse, TemplateErrorCode.GENERAL_ERROR.getHttpStatus());
    }
}

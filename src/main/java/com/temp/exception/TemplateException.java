package com.temp.exception;

import com.temp.constants.TemplateErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TemplateException extends RuntimeException {
    private final TemplateErrorCode errorCode;
}

package com.temp.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum TemplateErrorCode {

    GENERAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"General Error");

    private final HttpStatus httpStatus;
    private final String description;
}

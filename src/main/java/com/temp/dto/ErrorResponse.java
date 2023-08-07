package com.temp.dto;

import com.temp.constants.TemplateErrorCode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private String message;
    private TemplateErrorCode errorCode;
}

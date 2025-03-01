package com.project.eventmartuserservice.exception;

import com.project.eventmartcommon.apiPayload.code.BaseErrorCode;
import com.project.eventmartcommon.apiPayload.exception.CustomException;
import lombok.Getter;

@Getter
public class UserException extends CustomException {

    public UserException(BaseErrorCode errorCode) {
        super(errorCode);
    }
}

package com.rz.exception;

import com.rz.handle.ErrorInfo;

/**
 * Created by zhou on 2017/4/10.
 */
public class AppException extends RuntimeException {

    private Integer code;
    private ErrorInfo errorInfo;

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public AppException(ErrorInfo errorInfo){
        super(errorInfo.getMsg());
        this.errorInfo = errorInfo;
        this.code = errorInfo.getCode();
    }
}

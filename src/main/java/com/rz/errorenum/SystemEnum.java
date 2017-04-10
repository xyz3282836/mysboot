package com.rz.errorenum;

import com.rz.handle.ErrorInfo;

/**
 * Created by zhou on 2017/4/10.
 */
public enum SystemEnum implements ErrorInfo {
    SYSTEM_ERROR(-1,"system error"),
    PARAM_NOT_VALID(-1,"param not valid");

    private Integer code;
    private String msg;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    SystemEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

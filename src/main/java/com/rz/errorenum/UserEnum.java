package com.rz.errorenum;

import com.rz.handle.ErrorInfo;

/**
 * Created by zhou on 2017/4/10.
 */
public enum UserEnum implements ErrorInfo {

    USER_NO_EXIT(400201,"不存在此用户"),
    USER_ERROR(400202,"此用户被禁用");


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

    UserEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

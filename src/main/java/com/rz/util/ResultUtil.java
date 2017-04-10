package com.rz.util;


import com.rz.domain.Result;
import com.rz.handle.ErrorInfo;

/**
 * Created by zhou on 2017/4/10.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success(){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("success");
        result.setData("");
        return result;
    }

    public static Result error(ErrorInfo errorInfo){
        return error(errorInfo.getCode(),errorInfo.getMsg());
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData("");
        return result;
    }
}

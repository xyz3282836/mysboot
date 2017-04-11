package com.rz.handle;

import com.rz.domain.Result;
import com.rz.errorenum.SystemEnum;
import com.rz.exception.AppException;
import com.rz.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by zhou on 2017/4/10.
 */
@RestControllerAdvice
public class AppExceptionHandle {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public Result handle(Exception e){
        if(e instanceof AppException){
            return ResultUtil.error(((AppException) e).getErrorInfo());
        }else{
            return ResultUtil.error(SystemEnum.SYSTEM_ERROR);
        }
    }
}

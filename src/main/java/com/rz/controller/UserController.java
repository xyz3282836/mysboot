package com.rz.controller;

import com.rz.domain.AppConfig;
import com.rz.domain.Result;
import com.rz.errorenum.SystemEnum;
import com.rz.exception.AppException;
import com.rz.repository.UserRepository;
import com.rz.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2017/4/10.
 */
@RestController
public class UserController{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/getappc")
    public Result getappc(){
        return ResultUtil.success(appConfig.getName());
    }

    @GetMapping("/api/users")
    public Result getUsers(){
        return ResultUtil.success(userRepository.findAll());
    }

    @GetMapping("/api/user")
    public Result getUsers(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id) throws Exception{
        if(id < 1 || id == null){
            throw new AppException(SystemEnum.PARAM_NOT_VALID);
        }
        return ResultUtil.success(userRepository.findOne(id));
    }
}

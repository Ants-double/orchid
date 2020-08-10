package com.ants.orchid.controller;

import com.ants.orchid.pojo.domain.UserPo;
import com.ants.orchid.server.api.UserServer;
import com.antsdouble.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/10
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserServer userServer;

    @GetMapping(value = "getById")
    public Result getUserById(@RequestParam(value = "userId")String userId){
        UserPo userById = userServer.getUserById(userId);
        return  Result.success(userById);
    }
}

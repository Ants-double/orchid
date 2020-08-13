package com.ants.orchid.controller;

import com.ants.orchid.pojo.domain.UserPo;
import com.ants.orchid.server.api.UserServer;
import com.antsdouble.util.Result;
import javafx.util.Pair;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;

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

    @GetMapping(value = "by_name")
    public Result getUserById(@RequestParam(value = "name")String name){
        UserPo userByName = userServer.getUserByName(name);
        return  Result.success(userByName);
    }
    @GetMapping(value = "login")
    public Result login(@RequestParam(value = "name",required = true)String name,
                        @RequestParam(value = "password",required = true)String password){
        try {
            UserPo userByName = userServer.getUserByName(name);
            if (StringUtils.equals(password,userByName.getPassword())){
                return  Result.success("login success");
            }else {
                return  Result.error("password error");
            }
        }
        catch (Exception ex){
            return  Result.error("network exception");
        }


    }
}

package com.ants.orchid.controller;

import com.ants.orchid.pojo.domain.UserPo;
import com.ants.orchid.server.api.UserServer;
import com.antsdouble.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javafx.util.Pair;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
@Api(tags = "用户相关接口")
public class UserController {

    @Autowired
    UserServer userServer;

    @GetMapping(value = "by_name")
    public Result getUserById(@RequestParam(value = "name")String name){
        UserPo userByName = userServer.getUserByName(name);
        return  Result.success(userByName);
    }
    @ApiOperation("用户登录接口")
    @GetMapping(value = "login")
    public Result login(HttpServletRequest request, @RequestParam(value = "name",required = true)String name,
                        @RequestParam(value = "password",required = true)String password){
        UserPo userByName = null;
        try {
             userByName = userServer.getUserByName(name);

        }
        catch (Exception ex){
            return  Result.error("network exception");
        }
        if (userByName == null) {
            return Result.error("登录失败请重新尝试");
        } else {
            request.getSession().setAttribute("user", userByName);
        }
        return Result.success(userByName);
    }
}

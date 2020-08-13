package com.ants.orchid.server.impl;

import com.ants.orchid.mapper.UserMapper;
import com.ants.orchid.pojo.domain.UserPo;
import com.ants.orchid.server.api.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/10
 */
@Service(value = "UserServer")
public class UserServerImpl implements UserServer {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserPo getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}

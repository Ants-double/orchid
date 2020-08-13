package com.ants.orchid.server.api;

import com.ants.orchid.pojo.domain.UserPo;

public interface UserServer {
    public UserPo getUserByName(String userId);
}

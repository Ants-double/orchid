package com.ants.orchid.mapper;

import com.ants.orchid.pojo.domain.UserPo;
import org.apache.ibatis.annotations.Mapper;
/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/10
 */
@Mapper
public interface UserMapper {
    public UserPo getUserByName(String name);
}

package com.ants.orchid.mapper;

import com.ants.orchid.pojo.domain.ProjectPo;

import java.util.List;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/17
 */
public interface ProjectMapper {

    public Integer add(ProjectPo projectPo);
    public List<ProjectPo> getAll();
}

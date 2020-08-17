package com.ants.orchid.server.api;

import com.ants.orchid.pojo.domain.ProjectPo;

import java.util.List;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/17
 */
public interface ProjectServer {

    public Integer add(ProjectPo projectPo);
    public List<ProjectPo> getAll();
}

package com.ants.orchid.server.impl;

import com.ants.orchid.mapper.ProjectMapper;
import com.ants.orchid.pojo.domain.ProjectPo;
import com.ants.orchid.server.api.ProjectServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/17
 */
@Service(value = "ProjectServer")
public class ProjectServerImpl implements ProjectServer {

    @Autowired
    ProjectMapper projectMapper;
    @Override
    public Integer add(ProjectPo projectPo) {
        return projectMapper.add(projectPo);
    }

    @Override
    public List<ProjectPo> getAll() {
        return projectMapper.getAll();
    }
}

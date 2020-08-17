package com.ants.orchid.controller;

import com.ants.orchid.pojo.domain.ProjectPo;
import com.ants.orchid.server.api.ProjectServer;
import com.antsdouble.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/8/17
 */
@RestController
@RequestMapping(value = "/project")
@Api(tags = "项目相关接口")
public class ProjectController {

    @Autowired
    ProjectServer projectServer;
    @ApiOperation(value = "添加项目接口")
    @PostMapping(value = "/add")
    public Result add(@RequestBody ProjectPo projectPo ){
        try {
            Integer add = projectServer.add(projectPo);
            if (add>=1){
                return   Result.success("添加成功");
            }
            else {
                return  Result.error("添加失败");
            }
        }
        catch (Exception ex){
            return  Result.error(ex.getMessage());
        }
    }

    @ApiOperation(value = "获取所有项目",response = ProjectPo.class)
    @GetMapping(value = "all")
    public Result getAll(){
        return Result.success(projectServer.getAll());
    }
}

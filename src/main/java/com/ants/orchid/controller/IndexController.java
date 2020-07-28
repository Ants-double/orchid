package com.ants.orchid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/7/28
 */
@Controller()
@RequestMapping("/")
public class IndexController {
    @GetMapping("home")
    public ModelAndView index(){
        ModelAndView mv =  new ModelAndView("index");
        return mv;
    }
}

package com.ants.orchid.aop;

import com.alibaba.fastjson.JSON;
import com.antsdouble.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/6/5
 */
@Component
public class SessionInterceptor implements HandlerInterceptor {
    public static final Logger logger = LoggerFactory.getLogger(SessionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        logger.info("请求信息"+request);
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("user") != null) {
            return true;
        } else {
            logger.warn("开始请求地址拦截"+request.toString());
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/json;charset=utf-8");
            PrintWriter printWriter = response.getWriter();

            String error=JSON.toJSONString(Result.error("not login!"));

            printWriter.print(String.valueOf(error));

            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       // logger.warn("返回视图或String之前的处理");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
       // logger.warn("返回视图或String之前的处理");
    }
}

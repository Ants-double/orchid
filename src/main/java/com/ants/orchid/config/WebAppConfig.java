package com.ants.orchid.config;


import com.ants.orchid.aop.SessionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lyy
 * @Deprecated
 * @date 2020/6/5
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {


    @Autowired
    SessionInterceptor sessionInterceptor;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*").maxAge(3600);
        //.allowedMethods("PUT", "DELETE","POST","GET");
    }

    /**
     * 注册 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置拦截的路径、不拦截的路径、优先级等等
        registry.addInterceptor(sessionInterceptor).excludePathPatterns("/favicon.ico").addPathPatterns("/**").addPathPatterns("/*")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/loginOut")
                .excludePathPatterns("/swagger-ui.html")
                .excludePathPatterns("/swagger-resources/**")
                .excludePathPatterns("/v2/api-docs")
                .excludePathPatterns("/webjars/**")
                .excludePathPatterns("/home")
                .excludePathPatterns("/index.html")
                .excludePathPatterns("index.html")
                .excludePathPatterns("/static/**");
    }

}

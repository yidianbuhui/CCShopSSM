package com.yidianbuhui.ccshop.config;

import com.yidianbuhui.ccshop.interceptor.HeaderTokenInterceptor;
import com.yidianbuhui.ccshop.interceptor.HttpInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //跨域
        registry.addInterceptor(new HttpInterceptor()).addPathPatterns("/**");
        //token
       // registry.addInterceptor(new HeaderTokenInterceptor()).addPathPatterns("/**")
      //          .excludePathPatterns("/index.html","/","/upload/**","/portal/**");
    }
}

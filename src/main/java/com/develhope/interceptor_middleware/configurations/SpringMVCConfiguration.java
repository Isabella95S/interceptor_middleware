package com.develhope.interceptor_middleware.configurations;

import com.develhope.interceptor_middleware.interceptors.APILoggingInterceptor;
import com.develhope.interceptor_middleware.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    private LegacyInterceptor legacyInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(legacyInterceptor).addPathPatterns("/legacy/**","/legacy*");
        registry.addInterceptor(apiLoggingInterceptor).addPathPatterns("/legacy/**");
    }
}

package com.fortyseven.sideprojectboard.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebMvcConfiguration {
    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();

        return commonsMultipartResolver;
    }
}

package com.mhdMagdy.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Ahmed Nabil
 */

@Configuration
public class MvcCORS {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:5173/")
                        .allowedHeaders("*")
                        .allowedMethods("*")
                        .exposedHeaders("*")
                        .maxAge(3600);
            }
        };
    }
}

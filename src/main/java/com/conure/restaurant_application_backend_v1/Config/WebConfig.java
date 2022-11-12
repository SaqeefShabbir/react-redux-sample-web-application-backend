package com.conure.restaurant_application_backend_v1.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //registry.addMapping("/api/**").allowedOrigins("http://localhost:3000");
        registry.addMapping("/api/**").allowedOrigins("https://mywebapp00002.azurewebsites.net");
    }
}

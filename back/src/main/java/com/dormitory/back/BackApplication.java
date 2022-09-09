package com.dormitory.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BackApplication.class, args);
    }

    @Override
    public SpringApplicationBuilder createSpringApplicationBuilder() {
        return new SpringApplicationBuilder(BackApplication.class);
    }
}

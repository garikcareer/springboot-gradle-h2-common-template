package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.example")
@Import(JdbcConfig.class)
public class AppConfig {
    // Shared Spring context entry point
}
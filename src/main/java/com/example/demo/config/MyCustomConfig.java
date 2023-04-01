package com.example.demo.config;

import com.example.demo.config.properties.MyCustomProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyCustomProperties.class)
public class MyCustomConfig {
}

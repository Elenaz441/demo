package com.example.demo.config.properties;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@Value
@ConstructorBinding
@ConfigurationProperties(MyCustomProperties.PREFIX)
public class MyCustomProperties {
    public static final String PREFIX = "my-config";

    String myEnv;
    String myApp;
    List<String> myList;
}

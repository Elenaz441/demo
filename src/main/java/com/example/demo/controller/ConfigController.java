package com.example.demo.controller;

import com.example.demo.config.TestConfig;
import com.example.demo.config.properties.MyCustomProperties;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigController {

    final MyCustomProperties myCustomProperties;

    @GetMapping("/check-profile")
    public HashMap<String, String> getConfigInfo(){
        HashMap<String, String> profileInfo = new HashMap<>();
        profileInfo.put("env", myCustomProperties.getMyEnv());
        profileInfo.put("app", myCustomProperties.getMyApp());
        profileInfo.put("my-list", myCustomProperties.getMyList().toString());
        return profileInfo;
    }
}

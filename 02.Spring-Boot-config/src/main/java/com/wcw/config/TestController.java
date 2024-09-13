package com.wcw.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wu
 * @create 2024/9/13 15:06
 */
@RestController
public class TestController {
    @Value("${wcw.name}")
    private String name;
    @Value("${wcw.age}")
    private Integer age;
    @Autowired
    private ConfBean config;
    @Autowired
    private TestConfigBean testConfig;
    @GetMapping("/test")
    public String test() {
        return "name: " + name + ", age: " + age;
    }

    @GetMapping("/conf")
    public String getConf() {
        return config.getName()+","+config.getAge()+","+config.getNickname()+","+config.getWhole();
    }
    @GetMapping("/testConfig")
    private String testConfig() {
        return testConfig.toString();
    }
}

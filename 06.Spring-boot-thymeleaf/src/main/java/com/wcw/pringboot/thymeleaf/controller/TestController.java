package com.wcw.pringboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wu
 * @create 2024/9/23 17:03
 */
@Controller
public class TestController {

    @GetMapping("/test1")
    public String test() {
        return "test";
    }
}

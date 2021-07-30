package com.zwt.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhouwentao
 * @Date 2021-07-30-3:09 下午
 * @Email zhouwt@shuyilink.com
 */


@RestController
class HelloController {


    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2 你好";
    }
}

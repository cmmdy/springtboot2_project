package com.zwt.boot.controller;

import com.zwt.boot.bean.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhouwentao
 * @Date 2021-07-30-3:09 下午
 * @Email zhouwt@shuyilink.com
 */


@Slf4j
@RestController
class HelloController {


    @Autowired
    Pet fuckPet;

    @RequestMapping("/getPet")
    public String getPet() {
        return fuckPet.toString();
    }

    @RequestMapping("/hello")
    public String handle01(@RequestParam(value = "name") String name) {
        log.info("fuck");
        return "Hello,  Boot 2 你好"+name;
    }
}

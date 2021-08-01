package com.zwt.boot.boot02helloworld.controller;

import com.zwt.boot.boot02helloworld.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhouwentao
 * @Date 2021-08-01-14:21
 * @Email zhouwt@shuyilink.com
 */

@RestController
class HelloController {


    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}

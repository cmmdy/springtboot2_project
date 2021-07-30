package com.zwt.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author zhouwentao
 * @Date 2021-07-30-3:08 下午
 * @Email zhouwt@shuyilink.com
 */

/**
 * 主程序类
 * 这是一个SpringBoot应用
 */
@SpringBootApplication
class MainApplication {

    public static void main(String[] args) {
        //1、返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }
}

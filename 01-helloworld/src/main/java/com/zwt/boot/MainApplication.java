package com.zwt.boot;

import com.zwt.boot.bean.Pet;
import com.zwt.boot.bean.User;
import com.zwt.boot.config.MyConfig;
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
public class MainApplication {

    public static void main(String[] args) {
        //1、返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
//            System.out.println(name);
        }

        //3、从容器中获取组件

        Pet tomcat = run.getBean( Pet.class);
        Pet tomcat1 = run.getBean( Pet.class);

        System.out.println(tomcat1 == tomcat);



        MyConfig myconfig = run.getBean(MyConfig.class);
        System.out.println(myconfig);

        //如果@Configuration(proxyBeanMethods = true) 总是单实例
        User user = myconfig.user01();
        User user1 = myconfig.user01();
        System.out.println(user == user1);


    }
}

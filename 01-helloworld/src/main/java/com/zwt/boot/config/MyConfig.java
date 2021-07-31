package com.zwt.boot.config;

import com.zwt.boot.bean.Pet;
import com.zwt.boot.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhouwentao
 * @Date 2021-07-31-15:40
 * @Email zhouwt@shuyilink.com
 */

/**
 * 配置类里面使用@Bean标注在方法上，给容器注册组件，默认也是单实例
 * <p>
 * 配置类本身也是组件
 */
@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(Pet.class)
//告诉Springboot2这是一个配置类

public class MyConfig {

    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次，获取的都是之前注册容器中的单实例对象
     *
     * @return
     */
    @Bean//给容器中添加组件，以方法名作为组件的id。返回类型就是组件的类型。返回的值，就是组件在容器中的实例
    public User user01() {
        return new User("zhangsan", 18);
    }

//    @Beanx
//    public Pet tomcat() {
//        return new Pet("tomcat", "fuck");
//    }
}

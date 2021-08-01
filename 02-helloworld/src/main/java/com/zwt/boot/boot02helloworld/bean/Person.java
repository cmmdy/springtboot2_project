package com.zwt.boot.boot02helloworld.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author zhouwentao
 * @Date 2021-08-01-00:09
 * @Email zhouwt@shuyilink.com
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

   private String userName;
   private Boolean boss;
   private Date birth;
   private Integer age;
   private Pet pet;
   private String[] interests;
   private List<String> animal;
   private Map<String, Object> score;
   private Set<Double> salarys;
   private Map<String, List<Pet>> allPets;
}


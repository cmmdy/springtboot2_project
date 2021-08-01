package com.zwt.boot.boot02helloworld.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @Author zhouwentao
 * @Date 2021-08-01-00:10
 * @Email zhouwt@shuyilink.com
 */

@Data
@ToString
public class Pet {
    private String name;
    private Double weight;
}

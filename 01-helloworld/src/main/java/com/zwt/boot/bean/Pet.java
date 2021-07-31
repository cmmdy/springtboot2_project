package com.zwt.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author zhouwentao
 * @Date 2021-07-31-14:55
 * @Email zhouwt@shuyilink.com
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "mypet")
public class Pet {
   private String name;
   private String fuck;

}

package com.gxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2021
 * @description:
 * @author: guoxiaoying01
 * @create: 2022-01-02 19:06
 **/

@SpringBootApplication
@EnableEurekaClient//<--- 添加该标签
public class OrderMain80 {
    public static void main( String[] args ){
        SpringApplication.run(OrderMain80.class, args);
    }
}

package com.gxy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2021
 * @description:
 * @author: guoxiaoying01
 * @create: 2021-12-30 23:18
 **/

@SpringBootApplication
@EnableEurekaClient//<-----添加该注解
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
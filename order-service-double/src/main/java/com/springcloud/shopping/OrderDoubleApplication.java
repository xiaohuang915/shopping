package com.springcloud.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: pc.huang
 * @Date: 2018/11/14 14:59
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderDoubleApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderDoubleApplication.class, args);
    }
}

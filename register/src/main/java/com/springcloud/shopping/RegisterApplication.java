package com.springcloud.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: pc.huang
 * @Date: 2018/11/12 15:10
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterApplication {
    public static void main(String[] args){
        SpringApplication.run(RegisterApplication.class,args);
    }
}

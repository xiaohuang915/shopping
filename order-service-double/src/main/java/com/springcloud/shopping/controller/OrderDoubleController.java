package com.springcloud.shopping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: pc.huang
 * @Date: 2018/11/14 15:00
 * @Description:
 */
@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderDoubleController {
    @Value("${test}")
    private String test;

    @GetMapping("/getOrder/{id}")
    public String getOrder(@PathVariable String id) {
        return "orderDouble-user==" + id + test;
    }
}

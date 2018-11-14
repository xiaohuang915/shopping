package com.springcloud.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: pc.huang
 * @Date: 2018/11/14 10:45
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/getOrder/{id}")
    public String getOrder(@PathVariable String id) {
        return "order-user==" + id;
    }
}

package com.springcloud.shopping.controller;

import com.springcloud.shopping.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: pc.huang
 * @Date: 2018/11/14 11:46
 * @Description:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;
    @GetMapping("/get/{id}")
    public String getConsumer(@PathVariable String id){
        return consumerService.getOrder(id);
    }
}

package com.springcloud.shopping.service;

import com.springcloud.shopping.error.ConsumerFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: pc.huang
 * @Date: 2018/11/14 11:57
 * @Description:
 */
@FeignClient(name = "order-service",fallback = ConsumerFallback.class)
public interface ConsumerService {
    @GetMapping("/order/getOrder/{id}")
    String getOrder(@PathVariable("id") String id);
}

package com.springcloud.shopping.error;

import com.springcloud.shopping.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @Auther: pc.huang
 * @Date: 2018/11/14 12:46
 * @Description:
 */
@Component
public class ConsumerFallback implements ConsumerService {
    @Override
    public String getOrder(String id) {
        return "调用远程服务出错";
    }
}

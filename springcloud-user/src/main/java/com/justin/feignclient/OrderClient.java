package com.justin.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ORDER")
public interface OrderClient {


    @GetMapping("/order/get-order")
    String getOrder();
}

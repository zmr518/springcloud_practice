package com.justin.controller;

import com.justin.feignclient.OrderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/user")
@RefreshScope
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderClient orderClient;

    @Value("${spring.customer.name}")
    private String name;

    /**
     * restTemplate + Ribbon
     */
    @GetMapping("/get-user")
    public String getUser() {
        return restTemplate.getForObject("http://ORDER/order/get-order", String.class);
    }

    /**
     * openfeign
     */
    @GetMapping("/get-order")
    public String getOrder() {
        log.warn("spring.customer.name is [{}]", name);
        return orderClient.getOrder();
    }
}

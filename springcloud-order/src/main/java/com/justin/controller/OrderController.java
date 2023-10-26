package com.justin.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {


    @Value("${server.port}")
    private String port;

    /*@GetMapping("/get-order-hystrix")
    @HystrixCommand(fallbackMethod = "fallBack")
    public String getOrderHystrix() throws InterruptedException {
        log.warn("order request port [{}]", port);
        throw new RuntimeException("getOrder command failed");
    }

    public String fallBack() throws InterruptedException {
        log.warn("order request port [{}]", port);
        return "order fallBack!!!";
    }*/

    @GetMapping("/get-order")
    public String getOrder() throws InterruptedException {
        log.warn("order request port [{}]", port);
        return "order ok";
    }
}

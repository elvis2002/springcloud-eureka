package com.goodrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private EurekaDiscoveryClientConfiguration lifecycle;

    @RequestMapping("/online")
    public String online() {
        this.lifecycle.start();
        return "user online method";
    }

    @RequestMapping("/offline")
    public String offline() {
        this.lifecycle.stop();
        return "user offline method";
    }
}

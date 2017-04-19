package com.goodrain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/demo")
@RestController
public class DemoController {

    @RequestMapping("/show")
    public String show() {
        return "demo show";
    }
    
    @RequestMapping("/index")
    public String index() {
        return "demo index";
    }
}
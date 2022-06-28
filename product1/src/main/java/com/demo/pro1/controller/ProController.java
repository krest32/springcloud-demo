package com.demo.pro1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ProController {

    @GetMapping("pro/{key}")
    public String pro1(@PathVariable String key){
        return key+ " pro1";
    }
}

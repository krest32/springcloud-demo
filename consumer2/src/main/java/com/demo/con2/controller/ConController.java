package com.demo.con2.controller;

import com.demo.con2.client.ProClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ConController {

    @Autowired
    private ProClient proClient;

    @GetMapping("hello/{key}")
    public String con2(@PathVariable String key){
        String res = "con2 " + proClient.pro(key);
        return res;
    }

    @GetMapping("say")
    public String say(){
        return "con2 say";
    }
}

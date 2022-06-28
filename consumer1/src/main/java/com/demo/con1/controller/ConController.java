package com.demo.con1.controller;

import com.demo.con1.client.ProClient;
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
    public String hello(@PathVariable String key){
        String res =" con1 " + proClient.memberinfo(key);
        return res;
    }

    @GetMapping("say")
    public String say(){
        return "con1 say";
    }
}

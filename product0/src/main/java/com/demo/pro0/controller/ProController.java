package com.demo.pro0.controller;

import com.alibaba.fastjson.JSONObject;
import com.demo.pro0.entity.Response;
import com.demo.pro0.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@CrossOrigin
@RestController
public class ProController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("mongodb")
    public String testMongoDB() {
        List<User> userList = mongoTemplate.findAll(User.class);
        return JSONObject.toJSONString(userList);
    }


    @GetMapping("pro/{key}")
    public String pro1(@PathVariable String key) {
        return key + " pro0";
    }

    @GetMapping("search/{key}")
    public String memberinfo(@PathVariable String key) {
        return key + " search0";
    }

    @GetMapping("hello")
    public String hello() {
        Response response = new Response();
        response.setCode(200);
        response.setMsg("hello");
        String result = JSONObject.toJSONString(response);
        System.out.println(result);
        return result;
    }


}

package com.demo.con1.client;


import com.demo.con1.client.fallback.FallBackClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(value = "pro", fallback = FallBackClient.class)
public interface ProClient {

    @GetMapping("/pro/{key}")
    public String pro(@PathVariable String key);


    @GetMapping("search/{key}")
    public String memberinfo(@PathVariable String key);

}

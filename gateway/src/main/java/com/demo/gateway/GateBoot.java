package com.demo.gateway;


import com.demo.gateway.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

// 设定某个服务的负载均和方式
@RibbonClient(name = "con", configuration= MySelfRule.class)
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class GateBoot {
    public static void main(String[] args) {
        SpringApplication.run(GateBoot.class, args);
    }
}

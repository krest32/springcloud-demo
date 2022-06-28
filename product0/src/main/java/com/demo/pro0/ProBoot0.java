package com.demo.pro0;

import com.demo.pro0.utils.DemoEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


//@EnableFeignClients
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
//@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.demo"})
public class ProBoot0 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ProBoot0.class, args);
        DemoEvent demoEvent = new DemoEvent("", "world");
        run.publishEvent(demoEvent);
    }
}

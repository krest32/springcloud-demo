package com.demo.pro0.utils;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    Integer cnt = 1;

    /**
     * 会在初始化的时候就被执行，会执行2次
     * @param applicationContext
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("我是初始化的 MyApplicationContextInitializer...  "+cnt+" 次");
        cnt++;
    }
}

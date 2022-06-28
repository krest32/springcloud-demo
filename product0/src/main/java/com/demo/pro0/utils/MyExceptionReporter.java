package com.demo.pro0.utils;

import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.context.ConfigurableApplicationContext;

public class MyExceptionReporter implements SpringBootExceptionReporter {


    private ConfigurableApplicationContext context;

    // 必须要有一个有参的构造函数，否则启动会报错
    MyExceptionReporter(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @Override
    public boolean reportException(Throwable failure) {
        System.out.println("进入异常报告器");
        failure.printStackTrace();
        // 返回false会打印详细springboot错误信息，返回true则只打印异常信息
        return false;
    }
}

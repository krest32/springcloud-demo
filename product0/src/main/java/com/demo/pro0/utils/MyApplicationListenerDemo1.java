package com.demo.pro0.utils;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationListenerDemo1 implements ApplicationListener {
    /**
     * 监听所有事件，当然也可以监听指定事件
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.getClass());
    }
}

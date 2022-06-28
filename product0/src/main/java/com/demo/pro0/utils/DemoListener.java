package com.demo.pro0.utils;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        event.printMsg();
    }
}

package com.demo.pro0.utils;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
    private String msg;

    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public void printMsg(){
        System.out.println("msg = " + msg);
    }
}

package com.demo.pro0.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Component
public class DemoBeanPostProcesser implements InstantiationAwareBeanPostProcessor {
    //InstantiationAwareBeanPostProcessor 提供的方法， 在 Class<T> -> T 的转换过程中
    // 此时bean还没创建，可以通过这方法代替 Spring 容器创建的方法
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("DemoPostProcesser.postProcessBeforeInstantiation   ###  1");
        return null;
    }

    //InstantiationAwareBeanPostProcessor 提供的方法， 返回的值代表是否需要继续注入属性，
    // 如果返回true，则会调用postProcessProperties和postProcessPropertyValues 来注入属性
    // 此时bean已经创建，属性尚未注入
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("DemoPostProcesser.postProcessAfterInstantiation   ###  2");
        return true;
    }
    //InstantiationAwareBeanPostProcessor 提供的方法，可以在这个方法中进行bean属性的注入，Aop 就是在此方法中进行了代理的创建
    // 只有postProcessAfterInstantiation 返回true 时才会调用
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("DemoPostProcesser.postProcessProperties   ###  3");
        return pvs;
    }
    //InstantiationAwareBeanPostProcessor 提供的方法，可以在这个方法中进行bean属性的注入, 这个方法已经过时，使用postProcessProperties 代理
    // 只有postProcessAfterInstantiation 返回true 时 且 postProcessProperties 返回 null 时调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("DemoPostProcesser.postProcessPropertyValues   ###  4");
        return pvs;
    }

    // BeanPostProcessor 提供的方法，在bean初始化前调用，这时候的bean大体已经创建完成了，在完成一些其他属性的注入
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("DemoPostProcesser.postProcessBeforeInitialization   ###  5");
        return bean;
    }
    // BeanPostProcessor 提供的方法，在bean初始化后调用，这时候的bean 已经创建完成了
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("DemoPostProcesser.postProcessAfterInitialization   ###  6");
        return bean;
    }
}

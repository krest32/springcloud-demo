package com.demo.con2.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 随机 (Random)
 * 轮询 (RoundRobinRule) 默认
 * 一致性哈希 (ConsistentHash)
 * 哈希 (Hash)
 * 加权（Weighted）
 * ILoadBalance 负载均衡器
 * 选取最少并发量请求的服务器（BestAvailableRule）
 */
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule(){
        //定义为随机调用策略
//        return new RandomRule();
        return new RoundRobinRule();
    }
}

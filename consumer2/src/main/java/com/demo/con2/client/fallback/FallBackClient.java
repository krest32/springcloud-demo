package com.demo.con2.client.fallback;

import com.demo.con2.client.ProClient;
import org.springframework.stereotype.Component;

@Component
public class FallBackClient implements ProClient {

    @Override
    public String pro(String key) {
        return key+" product service error";
    }
}

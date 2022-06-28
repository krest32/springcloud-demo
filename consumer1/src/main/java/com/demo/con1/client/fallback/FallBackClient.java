package com.demo.con1.client.fallback;

import com.demo.con1.client.ProClient;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Component
public class FallBackClient implements ProClient {

    @Override
    public String pro(String key) {
        return key+" product service error";
    }

    @Override
    public String memberinfo(String key) {
        return null;
    }


}

package com.cc.service.impl;

import com.cc.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "welcome!";
    }
}

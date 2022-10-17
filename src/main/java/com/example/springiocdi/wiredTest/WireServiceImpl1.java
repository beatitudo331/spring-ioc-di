package com.example.springiocdi.wiredTest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class WireServiceImpl1 implements WireService{
    @Override
    public void test() {
        System.out.println("WireServiceImpl1.test");
    }
}

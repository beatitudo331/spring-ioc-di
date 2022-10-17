package com.example.springiocdi.wiredTest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("wire")
public class WireServiceImpl2 implements WireService{
    @Override
    public void test() {
        System.out.println("WireServiceImpl2.test");
    }
}

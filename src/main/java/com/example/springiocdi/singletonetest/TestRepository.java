package com.example.springiocdi.singletonetest;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TestRepository {

    public List<Integer> getData() {
        return Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    }

}

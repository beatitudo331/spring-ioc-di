package com.example.springiocdi.singletonetest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

//    private int num = 0;

    public List<Integer> count() {

        List<Integer> data = testRepository.getData();
        int num = 0;
        for (Integer datum : data) {
            data.set(num, datum + 1);
            num++;
        }
        return data;
    }


}

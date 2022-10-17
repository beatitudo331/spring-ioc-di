package com.example.springiocdi.wiredTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WireController {

//    @Autowired
//    WireService wireServiceImpl1;

    @Autowired
    @Qualifier("wire")
    WireService wireService;

    public void test() {
        wireService.test();
    }

}

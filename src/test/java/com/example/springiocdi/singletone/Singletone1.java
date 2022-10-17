package com.example.springiocdi.singletone;

public class Singletone1 {

    private static final Singletone1 singleton1 = new Singletone1();

    private Singletone1() {}

    public static Singletone1 getInstance() {
        return singleton1;
    }

}

package com.example.springiocdi.singletone;

public class Singletone3 {
    // Bil Pugh

    private Singletone3(){}

    private static class Singletone3Container {
        static final Singletone3 singletone3 = new Singletone3();
    }

    public static Singletone3 getInstance() {
        return Singletone3Container.singletone3;
    }

}

package com.example.springiocdi.singletone;

public class Singletone2 {

    private static Singletone2 singletone2 = null;

    private Singletone2() {

    }

    public static  Singletone2 getInstance() {
        initSingletone();
        return singletone2;
    }

    private static void initSingletone() {
//        synchronized (Singletone2.class) {
            if (singletone2 == null) {
                singletone2 = new Singletone2();
            }
//        }
    }

}

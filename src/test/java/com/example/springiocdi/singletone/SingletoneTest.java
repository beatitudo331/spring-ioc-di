package com.example.springiocdi.singletone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletoneTest {


    @Test
    @DisplayName("Singletone1 Test")
    void singletone1() {
        System.out.println(Singletone1.getInstance());
        System.out.println(Singletone1.getInstance());
        Assertions.assertThat(Singletone1.getInstance()).isSameAs(Singletone1.getInstance());
    }

    @Test
    @DisplayName("Singletone2 Test")
    void singletone2() {
        System.out.println(Singletone2.getInstance());
        System.out.println(Singletone2.getInstance());
        Assertions.assertThat(Singletone2.getInstance()).isSameAs(Singletone2.getInstance());
    }

    @Test
    @DisplayName("MultiThread Test")
    void multiThreadTest() {
        Runnable test = new ThreadTest();
        for (int i = 0; i < 15; i++) {
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
            new Thread(test).start();
        }

    }

    class ThreadTest implements Runnable
    {
        @Override
        public void run() {
            System.out.println("Singletone2.getInstance() = " + Singletone2.getInstance());
        }
    }



}

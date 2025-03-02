package com.example;

import com.example.helloworld.Main;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testSayHello() {
        Main main = new Main();
        String result = main.sayHello();
        assertEquals("Hello, World!", result);
    }
}

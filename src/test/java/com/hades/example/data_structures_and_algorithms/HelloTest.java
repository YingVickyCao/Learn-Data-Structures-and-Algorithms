package com.hades.example.data_structures_and_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void hi() {
        Hello hello = new Hello();
        Assertions.assertEquals("Hello, World",hello.hi());
    }
}
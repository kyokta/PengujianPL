package org.example;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class testLifeCycle {
    @BeforeAll
    void initClass() {
        System.out.println("init class");
    }

    @BeforeEach
    void initMethod() {
        System.out.println("init method");
    }

    @Test
    void testMethod() {
        System.out.println("execute test");
    }

    @AfterAll
    void cleanMethod() {
        System.out.println("clean method");
    }

    @AfterAll
    void cleanClass() {
        System.out.println("clean class");
    }

    @Test
    void testMethod1() {
        System.out.println("execute test 1");
    }

    @Test
    void testMethod2() {
        System.out.println("execute test 2");
    }
}

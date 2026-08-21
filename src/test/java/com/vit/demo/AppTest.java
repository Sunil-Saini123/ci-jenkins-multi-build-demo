package com.vit.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        int expected = 5;
        int actual = App.add(2, 3);

        if (actual != expected) {
            throw new AssertionError(
                "Test failed: expected " + expected + " but received " + actual
            );
        }

        System.out.println("TEST PASSED: App.add(2, 3) returned " + actual + ".");
        assertEquals(expected, actual);
    }
}
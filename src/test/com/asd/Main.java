package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testSomma() {
        assertEquals(5, Main.somma(2, 3));
        assertEquals(0, Main.somma(0, 0));
        assertEquals(-5, Main.somma(-2, -3));
        assertEquals(10, Main.somma(7, 3));
    }
}

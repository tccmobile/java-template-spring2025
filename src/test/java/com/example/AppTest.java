package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void appReturnsHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello, World!", classUnderTest.getGreeting());
    }
} 
package com.example.spring_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTests {

    @Test
    void testHello() {
        DemoApplication app = new DemoApplication();
        assertEquals("Hello Wold!", app.hello());
    }
}

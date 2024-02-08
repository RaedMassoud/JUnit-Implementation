package org.raed;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    Demo demo = new Demo();

    @Test
    public void divide() {
        assertEquals(2, demo.divide(10, 5));
        assertEquals(-2, demo.divide(-10, 5));
        assertEquals(-2, demo.divide(10, -5));
        assertEquals(2, demo.divide(-10, -5));
        assertEquals(0, demo.divide(10, 0));
        assertEquals(0, demo.divide(0, 10));
    }

    @Test
    public void reverseString() {
        assertEquals("avaJ", demo.reverseString("Java"));
        assertEquals("dear", demo.reverseString("raed"));
        assertEquals("leinaD", demo.reverseString("Daniel"));
        assertEquals("54321", demo.reverseString("12345"));
    }
}
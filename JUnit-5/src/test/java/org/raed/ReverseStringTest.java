package org.raed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString demo = new ReverseString();

    @Test
    void reverseString() {
        assertEquals("avaj", demo.reverseString("java"), "failed");
        assertEquals("ysae si avaj", demo.reverseString("java is easy"), "failed");
        assertEquals("?ysae si avaj", demo.reverseString("java is easy?"), "failed");
    }
}
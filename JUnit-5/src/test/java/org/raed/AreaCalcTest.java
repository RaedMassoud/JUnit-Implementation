package org.raed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalcTest {

    AreaCalc demo = new AreaCalc();

    @Test
    void areaOfSquareTest() {
        assertEquals(25, demo.areaOfSquare(5), "failed");
        assertEquals(100, demo.areaOfSquare(10), "failed");
        assertEquals(6.25, demo.areaOfSquare(2.5), "failed");
        assertEquals(0, demo.areaOfSquare(0), "failed");
        assertEquals(0, demo.areaOfSquare(-5), "failed");
    }

    @Test
    void areaOfCircleTest() {
        assertEquals(314, demo.areaOfCircle(10), "failed");
        assertEquals(13, demo.areaOfCircle(2), "failed");
        assertEquals(88, demo.areaOfCircle(5.3), "failed");
        assertEquals(0, demo.areaOfCircle(0), "failed");
        assertEquals(0, demo.areaOfCircle(-5), "failed");
        assertEquals(3, demo.areaOfCircle(1), "failed");
    }
}
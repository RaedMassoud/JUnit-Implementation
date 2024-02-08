package org.raed;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class PrimeValidationTest {

    PrimeValidation demo = new PrimeValidation();

    @Test
    void validate() {

        // Primes
        assertTrue(demo.validate(2), "failed");
        assertTrue(demo.validate(5), "failed");
        assertTrue(demo.validate(7), "failed");
        assertTrue(demo.validate(17), "failed");
        assertTrue(demo.validate(37), "failed");
        assertTrue(demo.validate(97), "failed");
        assertTrue(demo.validate(11), "failed");

        // Not primes
        assertFalse(demo.validate(1), "failed");
        assertFalse(demo.validate(4), "failed");
        assertFalse(demo.validate(6), "failed");
        assertFalse(demo.validate(12), "failed");
        assertFalse(demo.validate(0), "failed");
        assertFalse(demo.validate(-3), "failed");
        assertFalse(demo.validate(-7), "failed");
    }
}
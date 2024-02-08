package org.raed;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    Sort demo = new Sort();

    @Test
    void sortTest() {
        assertArrayEquals(new int[]{1,2,3,4,5}, demo.sort(new int[]{5,3,4,2,1}));
        assertArrayEquals(new int[]{3, 4}, demo.sort(new int[]{4,3}));
        assertArrayEquals(new int[]{10,11,12,13,14,15}, demo.sort(new int[]{12,11,15,14,13,10}));

    }

    @Test
    void sortTimeTest() {
        assertTimeout(Duration.ofMillis(1), () -> demo.sort(new int[]{43, 21, 12, 14, 9, 10}));
        assertTimeout(Duration.ofMillis(1), () -> demo.sort(new int[]{10, 5, 12, 99, 9, 3, 23}));
    }
}
package binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinInRotatedArrayTest {
    private MinInRotatedArray impl;

    @BeforeEach
    public void setUp() { impl = new MinInRotatedArrayImpl(); }

    @Test public void rotacionado() {
        assertEquals(0, impl.findMin(new Integer[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(1, impl.findMin(new Integer[]{3, 4, 5, 1, 2}));
        assertEquals(1, impl.findMin(new Integer[]{2, 3, 4, 5, 1}));
    }
    @Test public void semRotacao() {
        assertEquals(1, impl.findMin(new Integer[]{1, 2, 3, 4, 5}));
    }
    @Test public void pequenos() {
        assertEquals(5, impl.findMin(new Integer[]{5}));
        assertEquals(1, impl.findMin(new Integer[]{2, 1}));
        assertEquals(1, impl.findMin(new Integer[]{1, 2}));
        assertEquals(1, impl.findMin(new Integer[]{2, 3, 1}));
    }
    @Test public void negativos() {
        assertEquals(-9, impl.findMin(new Integer[]{0, 4, -9, -5, -1}));
    }
}

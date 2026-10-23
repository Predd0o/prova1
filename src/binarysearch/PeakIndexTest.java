package binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeakIndexTest {
    private PeakIndex impl;

    @BeforeEach
    public void setUp() { impl = new PeakIndexImpl(); }

    @Test public void picoNoMeio() {
        assertEquals(2, impl.peakIndex(new Integer[]{1, 3, 5, 4, 2}));
        assertEquals(1, impl.peakIndex(new Integer[]{1, 5, 3}));
    }
    @Test public void soCrescenteOuDecrescente() {
        assertEquals(2, impl.peakIndex(new Integer[]{1, 2, 3}));
        assertEquals(0, impl.peakIndex(new Integer[]{3, 2, 1}));
    }
    @Test public void pequenos() {
        assertEquals(0, impl.peakIndex(new Integer[]{7}));
        assertEquals(1, impl.peakIndex(new Integer[]{1, 2}));
        assertEquals(0, impl.peakIndex(new Integer[]{2, 1}));
    }
    @Test public void grande() {
        Integer[] a = new Integer[1001];
        for (int i = 0; i < 1001; i++) {
            a[i] = i <= 700 ? i : 1400 - i;
        }
        assertEquals(700, impl.peakIndex(a));
    }
}

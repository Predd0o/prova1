package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTestClosest {
    private Closest impl;

    @BeforeEach
    public void setUp() { impl = new ClosestImpl(); }

    @Test public void exatoEEntreElementos() {
        Integer[] array = {1, 4, 8};
        assertEquals(4, impl.closest(array, 4));
        assertEquals(4, impl.closest(array, 5));
        assertEquals(8, impl.closest(array, 7));
    }
    @Test public void foraDosExtremos() {
        Integer[] array = {1, 4, 8};
        assertEquals(1, impl.closest(array, -5));
        assertEquals(8, impl.closest(array, 20));
    }
    @Test public void arrayVazio() {
        assertNull(impl.closest(new Integer[]{}, 1));
    }
}
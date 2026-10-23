package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTestCeil {
    private Ceil impl;

    @BeforeEach
    public void setUp() { impl = new CeilImpl(); }

    @Test public void valorPresenteEAusente() {
        Integer[] array = {1, 2, 5, 5, 9};
        assertEquals(5, impl.ceil(array, 5));
        assertEquals(5, impl.ceil(array, 3));
    }
    @Test public void abaixoDoArray() {
        assertEquals(1, impl.ceil(new Integer[]{1, 2, 5}, -4));
    }
    @Test public void acimaDoArray() {
        assertNull(impl.ceil(new Integer[]{1, 2, 5}, 6));
    }
    @Test public void arrayVazio() {
        assertNull(impl.ceil(new Integer[]{}, 1));
    }
}
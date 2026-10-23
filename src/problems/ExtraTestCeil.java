package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExtraTestCeil {
    private Ceil impl;

    @BeforeEach
    public void setUp() { impl = new CeilImpl(); }

    @Test public void repetidos() {
        assertEquals(4, impl.ceil(new Integer[]{1, 4, 4, 4, 8}, 3));
        assertEquals(4, impl.ceil(new Integer[]{1, 4, 4, 4, 8}, 4));
    }
    @Test public void unitarioETodosIguais() {
        assertEquals(7, impl.ceil(new Integer[]{7}, 7));
        assertNull(impl.ceil(new Integer[]{7}, 8));
        assertEquals(3, impl.ceil(new Integer[]{3, 3, 3}, 2));
    }
    @Test public void negativos() {
        assertEquals(-3, impl.ceil(new Integer[]{-10, -3, 0, 6}, -4));
    }
    @Test public void limitesDeInteiro() {
        assertEquals(Integer.MIN_VALUE,
                impl.ceil(new Integer[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, Integer.MIN_VALUE));
        assertEquals(Integer.MAX_VALUE,
                impl.ceil(new Integer[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, 1));
    }
}
package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExtraTestClosest {
    private Closest impl;

    @BeforeEach
    public void setUp() { impl = new ClosestImpl(); }

    @Test public void empateEscolheMenor() {
        assertEquals(4, impl.closest(new Integer[]{1, 4, 8}, 6));
    }
    @Test public void repetidosEUnitario() {
        assertEquals(4, impl.closest(new Integer[]{1, 4, 4, 4, 9}, 5));
        assertEquals(7, impl.closest(new Integer[]{7}, 2));
    }
    @Test public void negativos() {
        assertEquals(-3, impl.closest(new Integer[]{-10, -3, 0, 6}, -2));
    }
    @Test public void distanciasSemOverflow() {
        assertEquals(Integer.MIN_VALUE,
                impl.closest(new Integer[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, 0));
        assertEquals(Integer.MAX_VALUE,
                impl.closest(new Integer[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, Integer.MAX_VALUE));
    }
    @Test public void vazio() {
        assertNull(impl.closest(new Integer[]{}, 0));
    }
}
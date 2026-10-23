package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExtraTestCountLessThan {
    private CountLessThan impl;

    @BeforeEach
    public void setUp() { impl = new CountLessThanImpl(); }

    @Test public void repetidosNoMeio() {
        assertEquals(2, impl.countLess(new Integer[]{1, 2, 5, 5, 5, 5, 9}, 5));
    }
    @Test public void todosIguais() {
        assertEquals(0, impl.countLess(new Integer[]{4, 4, 4, 4}, 4));
        assertEquals(4, impl.countLess(new Integer[]{4, 4, 4, 4}, 5));
    }
    @Test public void unitario() {
        assertEquals(0, impl.countLess(new Integer[]{7}, 7));
        assertEquals(1, impl.countLess(new Integer[]{7}, 8));
    }
    @Test public void negativos() {
        assertEquals(2, impl.countLess(new Integer[]{-10, -3, 0, 6}, -1));
    }
    @Test public void extremos() {
        assertEquals(3, impl.countLess(new Integer[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE - 1}, Integer.MAX_VALUE));
    }
}

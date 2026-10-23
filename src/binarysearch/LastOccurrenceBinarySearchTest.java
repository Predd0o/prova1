package binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LastOccurrenceBinarySearchTest {
    private LastOccurrenceBinarySearch<Integer> impl;
    private final Integer[] base = {1, 2, 2, 2, 4, 5, 7, 7, 9};

    @BeforeEach
    public void setUp() { impl = new LastOccurrenceBinarySearchImpl<>(); }

    @Test public void repetidos() {
        assertEquals(3, impl.lastOccurrence(base, 2));
        assertEquals(7, impl.lastOccurrence(base, 7));
    }
    @Test public void unicos() {
        assertEquals(0, impl.lastOccurrence(base, 1));
        assertEquals(8, impl.lastOccurrence(base, 9));
        assertEquals(4, impl.lastOccurrence(base, 4));
    }
    @Test public void ausentes() {
        assertEquals(-1, impl.lastOccurrence(base, 3));
        assertEquals(-1, impl.lastOccurrence(base, 0));
        assertEquals(-1, impl.lastOccurrence(base, 10));
    }
    @Test public void vazioEUnitario() {
        assertEquals(-1, impl.lastOccurrence(new Integer[]{}, 1));
        assertEquals(0, impl.lastOccurrence(new Integer[]{5}, 5));
    }
    @Test public void todosIguais() {
        assertEquals(4, impl.lastOccurrence(new Integer[]{3, 3, 3, 3, 3}, 3));
    }
    @Test public void comString() {
        LastOccurrenceBinarySearch<String> s = new LastOccurrenceBinarySearchImpl<>();
        assertEquals(2, s.lastOccurrence(new String[]{"a", "b", "b", "c"}, "b"));
    }
}

package binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstOccurrenceBinarySearchTest {
    private FirstOccurrenceBinarySearch<Integer> impl;
    private final Integer[] base = {1, 2, 2, 2, 4, 5, 7, 7, 9};

    @BeforeEach
    public void setUp() { impl = new FirstOccurrenceBinarySearchImpl<>(); }

    @Test public void repetidos() {
        assertEquals(1, impl.firstOccurrence(base, 2));
        assertEquals(6, impl.firstOccurrence(base, 7));
    }
    @Test public void unicos() {
        assertEquals(0, impl.firstOccurrence(base, 1));
        assertEquals(8, impl.firstOccurrence(base, 9));
        assertEquals(4, impl.firstOccurrence(base, 4));
    }
    @Test public void ausentes() {
        assertEquals(-1, impl.firstOccurrence(base, 3));
        assertEquals(-1, impl.firstOccurrence(base, 0));
        assertEquals(-1, impl.firstOccurrence(base, 10));
    }
    @Test public void vazioEUnitario() {
        assertEquals(-1, impl.firstOccurrence(new Integer[]{}, 1));
        assertEquals(0, impl.firstOccurrence(new Integer[]{5}, 5));
    }
    @Test public void todosIguais() {
        assertEquals(0, impl.firstOccurrence(new Integer[]{3, 3, 3, 3, 3}, 3));
    }
    @Test public void comString() {
        FirstOccurrenceBinarySearch<String> s = new FirstOccurrenceBinarySearchImpl<>();
        assertEquals(1, s.firstOccurrence(new String[]{"a", "b", "b", "c"}, "b"));
    }
}

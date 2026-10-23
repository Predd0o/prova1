package binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerSquareRootBinarySearchTest {
    private IntegerSquareRootBinarySearch impl;

    @BeforeEach
    public void setUp() { impl = new IntegerSquareRootBinarySearchImpl(); }

    @Test public void enunciado() {
        assertEquals(4, impl.integerSquareRoot(16));
        assertEquals(4, impl.integerSquareRoot(20));
        assertEquals(2, impl.integerSquareRoot(8));
    }
    @Test public void zeroEUm() {
        assertEquals(0, impl.integerSquareRoot(0));
        assertEquals(1, impl.integerSquareRoot(1));
    }
    @Test public void pequenos() {
        assertEquals(1, impl.integerSquareRoot(2));
        assertEquals(1, impl.integerSquareRoot(3));
        assertEquals(2, impl.integerSquareRoot(4));
        assertEquals(2, impl.integerSquareRoot(5));
    }
    @Test public void quadradosPerfeitos() {
        for (int k = 0; k <= 1000; k++) {
            assertEquals(k, impl.integerSquareRoot(k * k));
        }
    }
    @Test public void overflow() {
        assertEquals(46340, impl.integerSquareRoot(Integer.MAX_VALUE));
        assertEquals(46340, impl.integerSquareRoot(46340 * 46340));
        assertEquals(46339, impl.integerSquareRoot(46340 * 46340 - 1));
    }
}

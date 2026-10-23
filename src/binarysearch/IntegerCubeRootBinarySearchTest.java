package binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerCubeRootBinarySearchTest {
    private IntegerCubeRootBinarySearch impl;

    @BeforeEach
    public void setUp() { impl = new IntegerCubeRootBinarySearchImpl(); }

    @Test public void basicos() {
        assertEquals(0, impl.integerCubeRoot(0));
        assertEquals(1, impl.integerCubeRoot(1));
        assertEquals(1, impl.integerCubeRoot(7));
        assertEquals(2, impl.integerCubeRoot(8));
        assertEquals(2, impl.integerCubeRoot(26));
        assertEquals(3, impl.integerCubeRoot(27));
    }
    @Test public void cubosPerfeitos() {
        for (int k = 0; k <= 1290; k++) {
            assertEquals(k, impl.integerCubeRoot(k * k * k));
        }
    }
    @Test public void overflow() {
        assertEquals(1290, impl.integerCubeRoot(Integer.MAX_VALUE));
    }
}

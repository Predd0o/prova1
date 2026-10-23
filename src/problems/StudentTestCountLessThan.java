package problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Testes básicos da Questão 1 (os casos de borda estão em ExtraTestCountLessThan). */
public class StudentTestCountLessThan {
    private CountLessThan impl;

    @BeforeEach
    public void setUp() { impl = new CountLessThanImpl(); }

    @Test public void elementoPresente() {
        assertEquals(2, impl.countLess(new Integer[]{1, 2, 3, 4, 5}, 3));
    }
    @Test public void elementoAusente() {
        assertEquals(3, impl.countLess(new Integer[]{1, 2, 4, 6, 8}, 5));
    }
    @Test public void menorQueTodos() {
        assertEquals(0, impl.countLess(new Integer[]{10, 20, 30}, 5));
    }
    @Test public void maiorQueTodos() {
        assertEquals(3, impl.countLess(new Integer[]{10, 20, 30}, 99));
    }
    @Test public void arrayVazio() {
        assertEquals(0, impl.countLess(new Integer[]{}, 1));
    }
}

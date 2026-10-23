package problems;

public interface CountLessThan {

    /**
     * Devolve quantos elementos do array são ESTRITAMENTE menores que x.
     *
     * @param array array ordenado de forma crescente (pode ter repetidos, pode ser vazio)
     * @param x     valor de referência
     * @return quantidade de elementos menores que x
     */
    public int countLess(Integer[] array, Integer x);
}

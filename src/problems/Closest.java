package problems;

public interface Closest {

    /**
     * Devolve o valor do array mais próximo de x. Em caso de empate,
     * devolve o menor valor. Devolve null se o array estiver vazio.
     *
     * @param array array ordenado de forma crescente (pode ter repetidos)
     * @param x valor de referência
     * @return o valor mais próximo de x, ou null se o array estiver vazio
     */
    public Integer closest(Integer[] array, Integer x);
}
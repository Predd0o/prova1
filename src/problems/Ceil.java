package problems;

public interface Ceil {

    /**
     * Devolve o menor valor do array que seja maior ou igual a x,
     * ou null se não existir tal valor.
     *
     * @param array array ordenado de forma crescente (pode ter repetidos, pode ser vazio)
     * @param x valor de referência
     * @return o ceil de x no array, ou null se x for maior que todos os elementos
     */
    public Integer ceil(Integer[] array, Integer x);
}
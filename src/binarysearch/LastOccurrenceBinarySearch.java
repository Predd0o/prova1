package binarysearch;

public interface LastOccurrenceBinarySearch<T extends Comparable<T>> {

    /**
     * Devolve o índice da ocorrência mais à direita de element no array,
     * ou -1 se element não existir.
     *
     * @param array array ordenado de forma crescente (pode ter repetidos, pode ser vazio)
     * @param element elemento procurado
     */
    public int lastOccurrence(T[] array, T element);
}

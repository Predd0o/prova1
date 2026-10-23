package binarysearch;

/**
 * QUESTÃO 3 - LastOccurrence
 *
 * Espelho da anterior: índice da ocorrência MAIS À DIREITA de um elemento em
 * array ordenado com repetidos; -1 se não existir.
 *
 * Exemplos (array = {1, 2, 2, 2, 4, 5, 7, 7, 9}):
 *   element = 2  ->  3
 *   element = 7  ->  7
 *   element = 3  -> -1
 *
 * RESTRIÇÕES EXTRAS:
 *  - Genérico: T extends Comparable<T>.
 * RESTRIÇÕES GERAIS (valem para toda a classe):
 *  - Busca binária RECURSIVA. Proibido for, while e do.
 *  - Um único return por método (use uma variável 'resultado').
 *  - Proibido break e continue.
 *  - Proibido declarar atributos na classe.
 *  - No máximo UM método auxiliar, com no máximo 4 parâmetros.
 *  - Meio calculado como low + (high - low) / 2 (sem overflow).
 *  - Não percorrer nem copiar o array, não criar coleções.
 *  - Comparar sempre com compareTo (nunca com == , < ou >).

 */
public class LastOccurrenceBinarySearchImpl<T extends Comparable<T>>
        implements LastOccurrenceBinarySearch<T> {

    @Override
    public int lastOccurrence(T[] array, T element) {
        int resultado = busca(array, element, 0, array.length - 1);
        return resultado;
    }

    private int busca(T[] array, T element, int l, int r){
        int resultado;
        if(l > r){
            resultado = -1;
        }else{
            int m = (l + r) / 2;
            int cmp = array[m].compareTo(element);
            if(cmp < 0){
                resultado = busca(array, element, m + 1, r);
            }else if(cmp > 0){
                resultado = busca(array, element, l, m - 1);
            }else if(m == array.length - 1 || array[m + 1].compareTo(element) > 0){
                resultado = m;
            }else{
                resultado = busca(array, element, m + 1, r);
            }
        }
        return resultado;

    }
}

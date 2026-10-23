package binarysearch;

/**
 * QUESTÃO 2 - FirstOccurrence
 *
 * Índice da ocorrência MAIS À ESQUERDA de um elemento em array ordenado com
 * repetidos; -1 se não existir. Achar "um" índice igual não basta.
 *
 * Exemplos (array = {1, 2, 2, 2, 4, 5, 7, 7, 9}):
 *   element = 2  ->  1
 *   element = 7  ->  6
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
public class FirstOccurrenceBinarySearchImpl<T extends Comparable<T>>
        implements FirstOccurrenceBinarySearch<T> {

    @Override
    public int firstOccurrence(T[] array, T element) {
        int resultado = firstOccurrenceAux(array, element, 0, array.length - 1);
        return resultado;
    }

    private int firstOccurrenceAux(T[] array, T element, int l, int r) {
        int resultado = -1; 
        if(l > r){
          resultado = -1;
        }else{
            int m = (l + r) / 2;
            int cmp = array[m].compareTo(element);
            if (cmp < 0){
                resultado = firstOccurrenceAux(array, element, m + 1, r);
            }else if (cmp > 0){
                resultado = firstOccurrenceAux(array, element, l, m - 1);
            }else if(m == 0 || array[m - 1].compareTo(element) < 0){
                resultado = m;
            }else{
                resultado = firstOccurrenceAux(array, element, l, m - 1);
            }
        }
        return resultado;
    }
}

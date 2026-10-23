package binarysearch;

/**
 * QUESTÃO 7 - PeakIndex
 *
 * Dado um array de inteiros DISTINTOS que cresce estritamente até um pico e
 * depois decresce estritamente (ex.: {1, 3, 5, 4, 2}), devolva o ÍNDICE do pico.
 * O array pode ser só crescente ou só decrescente. Tem pelo menos 1 elemento.
 *
 * Exemplos:
 *   {1, 3, 5, 4, 2} -> 2
 *   {1, 2, 3}       -> 2
 *   {3, 2, 1}       -> 0
 *
 * RESTRIÇÕES EXTRAS:
 *  - Complexidade O(log n).
 *  - Não há alvo: compare a[mid] com um vizinho.
 * RESTRIÇÕES GERAIS (valem para toda a classe):
 *  - Busca binária RECURSIVA. Proibido for, while e do.
 *  - Um único return por método (use uma variável 'resultado').
 *  - Proibido break e continue.
 *  - Proibido declarar atributos na classe.
 *  - No máximo UM método auxiliar, com no máximo 4 parâmetros.
 *  - Meio calculado como low + (high - low) / 2 (sem overflow).
 *  - Não percorrer nem copiar o array, não criar coleções.

 */
public class PeakIndexImpl implements PeakIndex {

    @Override
    public int peakIndex(Integer[] array) {
        return busca(array, 0, array.length - 1);
    }
    
    private int busca(Integer[] a, int l, int r){
        int resultado;
        if(l >= r){
            resultado = l;
        }else{
            int m = l + (r - l) / 2;
            if(a[m] < a[m + 1]){
                resultado = busca(a, m + 1, r);
            }else{
                resultado = busca(a, l, m);
            }
        }
        return resultado;   
    }
}

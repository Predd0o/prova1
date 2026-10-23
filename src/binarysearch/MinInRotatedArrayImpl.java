package binarysearch;

/**
 * QUESTÃO 6 - MinInRotatedArray
 *
 * Dado um array de inteiros DISTINTOS que foi ordenado e depois rotacionado
 * (ex.: {4, 5, 6, 7, 0, 1, 2}), devolva o MENOR VALOR (não o índice).
 * O array tem pelo menos 1 elemento e pode estar sem rotação.
 *
 * Exemplos:
 *   {4, 5, 6, 7, 0, 1, 2} -> 0
 *   {3, 4, 5, 1, 2}       -> 1
 *   {1, 2, 3, 4, 5}       -> 1
 *
 * RESTRIÇÕES EXTRAS:
 *  - Complexidade O(log n).
 *  - O array NÃO está ordenado: pense no que dá para descobrir comparando a[mid]
 *    com um dos extremos.
 * RESTRIÇÕES GERAIS (valem para toda a classe):
 *  - Busca binária RECURSIVA. Proibido for, while e do.
 *  - Um único return por método (use uma variável 'resultado').
 *  - Proibido break e continue.
 *  - Proibido declarar atributos na classe.
 *  - No máximo UM método auxiliar, com no máximo 4 parâmetros.
 *  - Meio calculado como low + (high - low) / 2 (sem overflow).
 *  - Não percorrer nem copiar o array, não criar coleções.

 */
public class MinInRotatedArrayImpl implements MinInRotatedArray {

    @Override
    public int findMin(Integer[] array) {
        return array[busca(array, 0, array.length - 1)];
    }

    private int busca(Integer[] a, int l, int r){
        int resultado;
        if(l >= r){
            resultado = l;
        }else{
            int m = l + (r - l) / 2;
            if(a[m] > a[r]){
                resultado = busca(a, m + 1, r);
            }else{
                resultado = busca(a, l, m);
            }
        }
        return resultado;   
    }
}

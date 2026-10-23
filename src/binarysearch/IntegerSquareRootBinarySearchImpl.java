package binarysearch;

/**
 * QUESTÃO 4 - IntegerSquareRoot
 *
 * Maior k tal que k * k <= n (n >= 0).
 * Aqui NÃO há array: a busca binária é sobre o intervalo de respostas possíveis.
 *
 * Exemplos:  16 -> 4   20 -> 4   8 -> 2   0 -> 0   1 -> 1
 *
 * RESTRIÇÕES EXTRAS:
 *  - Proibido Math.sqrt, Math.pow e similares.
 *  - Proibido overflow: n pode ser Integer.MAX_VALUE (cuidado com mid * mid).
 * RESTRIÇÕES GERAIS (valem para toda a classe):
 *  - Busca binária RECURSIVA. Proibido for, while e do.
 *  - Um único return por método (use uma variável 'resultado').
 *  - Proibido break e continue.
 *  - Proibido declarar atributos na classe.
 *  - No máximo UM método auxiliar, com no máximo 4 parâmetros.
 *  - Meio calculado como low + (high - low) / 2 (sem overflow).
 *  - Não percorrer nem copiar o array, não criar coleções.

 */
public class IntegerSquareRootBinarySearchImpl
        implements IntegerSquareRootBinarySearch {

    @Override
    public int integerSquareRoot(int n) {
        return busca(n, 0, n);
    }

    private int busca(int n, int l, int r){
        int resultado;
        if(l > r){
            resultado = r;
        }else{
            int m = l + (r - l) / 2;
            if(m == 0 || m <= n / m){
                resultado = busca(n, m + 1, r);
            }else{
                resultado = busca(n, l, m - 1);
            }
        }
        return resultado;   
    }
}

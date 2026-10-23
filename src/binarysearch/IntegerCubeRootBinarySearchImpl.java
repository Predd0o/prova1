package binarysearch;

/**
 * QUESTÃO 5 - IntegerCubeRoot
 *
 * Variação da raiz quadrada: maior k tal que k * k * k <= n, para n >= 0.
 *
 * Exemplos:  0 -> 0   7 -> 1   8 -> 2   26 -> 2   27 -> 3
 *
 * RESTRIÇÕES EXTRAS:
 *  - Proibido Math.cbrt, Math.pow e similares.
 *  - Proibido overflow: k * k * k estoura int já para k = 1291.
 * RESTRIÇÕES GERAIS (valem para toda a classe):
 *  - Busca binária RECURSIVA. Proibido for, while e do.
 *  - Um único return por método (use uma variável 'resultado').
 *  - Proibido break e continue.
 *  - Proibido declarar atributos na classe.
 *  - No máximo UM método auxiliar, com no máximo 4 parâmetros.
 *  - Meio calculado como low + (high - low) / 2 (sem overflow).
 *  - Não percorrer nem copiar o array, não criar coleções.

 */
public class IntegerCubeRootBinarySearchImpl
        implements IntegerCubeRootBinarySearch {

    @Override
    public int integerCubeRoot(int n) {
        return busca(n, 0, n);
    }

    private int busca(int n, int l, int r){
        int resultado;
        if(l > r){
            resultado = r;
        }else{
            int m = l + (r - l) / 2;
            if(m == 0 || m <= n / m / m){
                resultado = busca(n, m + 1, r);
            }else{
                resultado = busca(n, l, m - 1);
            }
        }
        return resultado;   
    }
}

package problems;

/**
 * QUESTÃO 9 - Closest
 *
 * Encontrar o valor do array cuja distância até x seja a menor.
 * Em caso de empate, devolver o menor valor. Para um array vazio, devolver null.
 *
 * Exemplos (array = {1, 4, 8}):
 *   x = 5 -> 4
 *   x = 7 -> 8
 *   x = 4 -> 4
 *
 * RESTRIÇÕES EXTRAS:
 *  - Não percorrer o array para procurar a resposta; use busca binária.
 *  - Comparar distâncias sem causar overflow para valores Integer.
 * RESTRIÇÕES GERAIS (valem para toda a classe):
 *  - Busca binária RECURSIVA. Proibido for, while e do.
 *  - Um único return por método (use uma variável 'resultado').
 *  - Proibido break e continue.
 *  - Proibido declarar atributos na classe.
 *  - No máximo UM método auxiliar, com no máximo 4 parâmetros.
 *  - Meio calculado como low + (high - low) / 2 (sem overflow).
 *  - Não percorrer nem copiar o array, não criar coleções.
 *  - Comparar valores com compareTo.
 */
public class ClosestImpl implements Closest {

    @Override
    public Integer closest(Integer[] array, Integer x) {
        Integer resposta;
        if(array.length == 0){
            resposta = null;
        }else{
            int i = busca(array, x, 0, array.length - 1);
            if(i == 0){
                resposta = array[0];
            }else if(i == array.length){
                resposta = array[array.length - 1];
            }else{
                int dist1 = Math.abs(array[i - 1] - x);
                int dist2 = Math.abs(array[i] - x);
                if(dist1 <= dist2){
                    resposta = array[i - 1];
                }else{
                    resposta = array[i];
                }
            }
        }
        return resposta;
    }

    private int busca(Integer[] array, Integer x, int l, int r){
        int resultado;
        if(l > r){
            resultado = l;
        }else{
            int mid = l + (r - l) / 2;
            if(array[mid].compareTo(x) < 0){
                resultado = busca(array, x, mid + 1, r);
            }else{
                resultado = busca(array, x, l, mid - 1);
            }
        }
        return resultado;
    }
}
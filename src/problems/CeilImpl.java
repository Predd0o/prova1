package problems;

/**
 * QUESTÃO 8 - Ceil
 *
 * Encontrar o menor valor do array que seja maior ou igual a x.
 * Devolver null se não existir esse valor.
 *
 * Exemplos (array = {1, 2, 5, 5, 9}):
 *   x = 3  ->  5
 *   x = 5  ->  5
 *   x = 10 -> null
 *
 * RESTRIÇÕES EXTRAS:
 *  - Não percorrer o array para procurar a resposta; use busca binária.
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
public class CeilImpl implements Ceil {

    @Override
    public Integer ceil(Integer[] array, Integer x) {
        Integer resposta;
        int i = busca(array, x, 0, array.length - 1);
        if(i < array.length){
            resposta = array[i];
        }else{
            resposta = null;
        }
        return resposta; 
    }

    private Integer busca(Integer[] array, Integer x, int l, int r){
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

// Versao Floor: maior valor do array que seja menor ou igual a x.
// public Integer floor(Integer[] array, Integer x) {
//     Integer resposta;
//     int i = buscaFloor(array, x, 0, array.length - 1);
//     if(i >= 0){
//         resposta = array[i];
//     }else{
//         resposta = null;
//     }
//     return resposta;
// }
//
// private Integer buscaFloor(Integer[] array, Integer x, int l, int r){
//     int resultado;
//     if(l > r){
//         resultado = r;
//     }else{
//         int mid = l + (r - l) / 2;
//         if(array[mid].compareTo(x) <= 0){
//             resultado = buscaFloor(array, x, mid + 1, r);
//         }else{
//             resultado = buscaFloor(array, x, l, mid - 1);
//         }
//     }
//     return resultado;
// }
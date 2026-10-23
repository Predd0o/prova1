package problems;

/**
 * QUESTÃO 1 - CountLessThan
 *
 * Contar quantos elementos de um array ordenado são estritamente menores que x.
 *
 * Exemplos:
 *   {1, 2, 5, 5, 5, 9}, x = 5  ->  2
 *   {1, 2, 5, 5, 5, 9}, x = 6  ->  5
 *   {}, x = 3                   ->  0
 *
 * RESTRIÇÕES EXTRAS (além das gerais):
 *  - Nada de contagem (nenhum contador, nenhum ++ / += para contar elementos).
 *  - Apenas UM método auxiliar, com até 4 parâmetros.
 * RESTRIÇÕES GERAIS (valem para toda a classe):
 *  - Busca binária RECURSIVA. Proibido for, while e do.
 *  - Um único return por método (use uma variável 'resultado').
 *  - Proibido break e continue.
 *  - Proibido declarar atributos na classe.
 *  - No máximo UM método auxiliar, com no máximo 4 parâmetros.
 *  - Meio calculado como low + (high - low) / 2 (sem overflow).
 *  - Não percorrer nem copiar o array, não criar coleções.

 */
public class CountLessThanImpl implements CountLessThan {

    @Override
    public int countLess(Integer[] array, Integer x) {
        int resultado = countLessAux(array, x, 0, array.length - 1);
        return resultado;
    }

    private int countLessAux(Integer[] array, Integer x, int l, int r){ // Busca o limite inferior de x no intervalo l..r.
        int resultado; // Armazena a resposta; zero também cobre o caso sem elementos menores.
        if (l > r){ // Intervalo vazio: a busca encontrou o ponto de inserção de x.
            resultado = l; // Todos os índices anteriores a l contêm valores menores que x.
        }else{ // Ainda há posições que podem conter o primeiro valor maior ou igual a x.
            int m = (r + l) / 2; // Calcula o meio
            if (array[m].compareTo(x) < 0){ // Se o meio é menor que x, o limite está à direita.
                resultado = countLessAux(array, x, m + 1, r); // Descarta o meio e a metade esquerda.
            }else{ // Se é igual ou maior, o limite pode estar no meio ou à esquerda.
                resultado = countLessAux(array, x, l, m - 1); // Descarta o meio e a metade direita.
            }
        }
        return resultado; // Devolve o índice do primeiro valor >= x, igual à quantidade procurada.
    }
}

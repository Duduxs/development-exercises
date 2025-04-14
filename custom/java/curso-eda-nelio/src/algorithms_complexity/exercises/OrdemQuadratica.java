package src.algorithms_complexity.exercises;

import java.util.Arrays;

public class OrdemQuadratica {

    public static void main(String[] args) {
        Arrays.stream(higherValues(new int[]{7, 3, 8, 7, 5})).forEach(System.out::println);
    }

    /**
     * Função que recebe um vetor de números, e retorna um novo vetor dizendo quantos elementos maiores
     * existem no vetor pra cada elemento do vetor.
     *
     * > > > Análise da complexidade de tempo
     *  Usando a anotação assintótica
     *      O(n²) => Big O - Ordem quadrática
     *      Θ(n²) => Theta - Ordem quadrática
     *      Ω(n²) => Ômega - Ordem quadrática
     *  Sem a anotação assintótica pra qualquer caso
     *      N*N*1 => N*N ou N² é o caso de maior ordem aqui.
     *
     *  > > > Análise da complexidade de espaço
     *  Usando a anotação assintótica
     *      O(n) => Big O - Ordem linear
     *      Θ(n) => Theta - Ordem linear
     *      Ω(n) => Ômega - Ordem linear
     *  Sem a anotação assintótica pra qualquer caso
     *      N + 1 + 1 => N é o caso de maior ordem aqui.
     */
    public static int[] higherValues(final int[] elements) {
        var result = new int[elements.length]; // N (Espaço) var result

        for (var i = 0; i < elements.length; i++) { // N (Tempo) -- 1 (Espaço) var i
            for (var j = 0; j < elements.length; j++) { // N (Tempo) -- 1 (Espaço) var j
                if (elements[j] > elements[i]) { // 1 (Tempo)
                    result[i] += 1; // 1 (Tempo)
                }
            }
        }

        return result;
    }
}

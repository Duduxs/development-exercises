package src.searches_and_sorts.exercises;

import java.util.Arrays;

public class BuscaSequencialOrdenada {

    void main() {
        System.out.println(orderedSequentialSearch(new int[]{-2, 6, 8, 9, 16, 20, 23, 28}, 10));
    }

    /**
     * Função para encontrar a posição de um elemento dentro de uma lista ordenada.
     * Se o elemento não existir na lista ou for menor que o elemento na posição atual do array então retorne -1.
     * <p>
     * > > > Análise da complexidade de tempo
     * Ω(1) Ômega de 1 => O elemento procurado é o primeiro da lista
     * Θ(n) Theta de N => O elemento procurado está em uma posição "qualquer" da lista
     * O(n) Big O de N => O elemento procurado é o último da lista, ou não existe
     */
    public static int orderedSequentialSearch(int[] arr, int key) {
        Arrays.sort(arr);
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
            if (arr[i] > key) return -1;
        }
        return -1;
    }

}

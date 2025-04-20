package src.searches_and_sorts.exercises;

public class BuscaSequencial {

    void main() {
        System.out.println(sequentialSearch(new int[]{28, 6, -2, 9, 16, 20, 23, 8}, 20));
    }

    /**
     * Função para encontrar a posição de um elemento dentro de uma lista.
     * Se o elemento não existir na lista retorne -1.
     *
     * > > > Análise da complexidade de tempo
     * Ω(1) Ômega de 1 => O elemento procurado é o primeiro da lista
     * Θ(n) Theta de N => O elemento procurado está em uma posição "qualquer" da lista
     * O(n) Big O de N => O elemento procurado é o último da lista, ou não existe
     */
    public static int sequentialSearch(int[] arr, int key) {
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

}

package src.algorithms_complexity.exercises;

public class BuscaSequencial {

    void main() {
        System.out.println(buscaSequencial(new int[]{15, 82, 79, 32, 41, 28}, 32));
    }

    /**
     * Função para encontrar a posição de um elemento dentro de uma lista.
     * Se o elemento não existir na lista retorne -1.
     *
     * > > > Análise da complexidade de tempo
     * Melhor caso: O elemento procurado é o primeiro da lista -> 1 passo
     * f(n) = 1 (função constante)
     *
     * Pior caso: O elemento procurado é o último da lista, ou não existe -> n passos
     * f(n) = n (função linear)
     *
     * Caso médio: O elemento procurado está em uma posição "qualquer" da lista -> n/2 passos
     * f(n) = n/2 (função linear)
     */
    public static int buscaSequencial(final int[] vetor, final int elemento) {
        for (var i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) return i;
        }
        return -1;
    }
}

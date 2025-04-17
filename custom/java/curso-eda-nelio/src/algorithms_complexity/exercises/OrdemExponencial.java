package src.algorithms_complexity.exercises;

public class OrdemExponencial {

    public static void main(String[] args) {
        System.out.println(fibbonaci(40));
    }

    /**
     * Função para retornar o valor de uma dada posição da sequência de Fibbonaci.
     * A sequência de Fibbonaci começa com 0,1 e depois cada número é a soma de
     * seus dois antecessores: 0 1 1 2 3 5 8 13...
     *
     * > > > Análise da complexidade de tempo
     *  Usando a anotação assintótica
     *      O(2ⁿ) => Big O - Ordem exponencial
     *
     *  > > > Análise da complexidade de espaço
     *  Usando a anotação assintótica
     *      O(n) => Big O - Ordem linear
     */
    public static int fibbonaci(int value) {
        if (value == 0 || value == 1) {
            return value;
        }

        return fibbonaci(value - 1) + fibbonaci(value - 2);
    }

}

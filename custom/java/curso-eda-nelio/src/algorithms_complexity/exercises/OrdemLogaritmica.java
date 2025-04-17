package src.algorithms_complexity.exercises;

public class OrdemLogaritmica {

    public static void main(String[] args) {
        var array = new int[]{7, 13, 20, 25, 28, 31, 35, 39, 40, 45, 46, 48, 57, 59, 63, 71};
        System.out.println(find(array, 39)); // 7
        System.out.println(find(array, 46)); // 10
        System.out.println(find(array, 22)); // -1
    }

    /**
     * Função que encontra a posição de um elemento em um array ordenado de números.
     *
     * > > > Análise da complexidade de tempo
     *  Usando a anotação assintótica
     *      O(logN) => Big O - Ordem logarítmica
     *      Θ(logN) => Theta - Ordem logarítmica
     *      Ω(1) => Ômega - Ordem constante
     *
     *  > > > Análise da complexidade de espaço
     *  Usando a anotação assintótica
     *      O(1) => Big O - Ordem constante
     */
    public static int find(int[] vector, int element) {
        return find(vector, element, 0, vector.length - 1);
    }

    public static int find(int[] vector, int element, int startPosition, int endPosition) {
        if (startPosition > endPosition) {
            return -1;
        }

        var middle = (int) Math.floor((startPosition + endPosition) / 2);

        if (vector[middle] == element) {
            return middle;
        } else if (vector[middle] > element) {
            return find(vector, element, startPosition, middle - 1);
        } else {
            return find(vector, element, middle + 1, endPosition);
        }

    }
}

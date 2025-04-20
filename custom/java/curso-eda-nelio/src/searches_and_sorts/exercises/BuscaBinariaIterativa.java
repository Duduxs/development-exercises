package src.searches_and_sorts.exercises;

public class BuscaBinariaIterativa {

    void main() {
        var arr = new int[]{-5, 0, 2, 8, 13, 16, 19, 23, 29, 34, 38};
        System.out.println(binarySearch(arr, 34)); //9
        System.out.println(binarySearch(arr, 16)); // 5
        System.out.println(binarySearch(arr, 8)); // 3
        System.out.println(binarySearch(arr, -6)); //-1
    }

    /**
     * Função para encontrar a posição de um elemento dentro de uma lista ordenada.
     * Se o elemento não existir na lista então retorne -1.
     * <p>
     * > > > Análise da complexidade de tempo
     * Ω(1) Ômega de 1 => O elemento procurado está no meio do array
     * Θ(log n) Theta de N => O elemento procurado está em uma posição "qualquer" da lista e precisou dividir algumas vezes a estrutura de dados para encontrá-lo.
     * O(log n) Big O de N => O elemento procurado não existe ou precisou do número máximo de divisões da estrutura de dados para encontrá-lo.
     */
    public static int binarySearch(int[] array, int key) {
        var lowestPosition = 0;
        var highestPosition = array.length - 1;

        while (highestPosition > lowestPosition) {
            var middle = Math.round((highestPosition + lowestPosition) / 2);

            if (key > array[middle]) lowestPosition = middle + 1;
            else if (key < array[middle]) highestPosition = middle - 1;
            else return middle;
        }

        return -1;
    }
}

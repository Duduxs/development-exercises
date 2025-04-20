package src.searches_and_sorts.exercises;

public class BuscaBinariaRecursiva {

    void main() {
        var arr = new int[]{-5, 0, 2, 8, 13, 16, 19, 23, 29, 34, 38};
        System.out.println(binarySearchRecursively(arr, 34)); //9
        System.out.println(binarySearchRecursively(arr, 16)); // 5
        System.out.println(binarySearchRecursively(arr, 8)); // 3
        System.out.println(binarySearchRecursively(arr, -6)); //-1
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
    public static int binarySearchRecursively(int[] array, int key) {
        return binarySearchTailRecursively(array, key, 0, array.length - 1);
    }

    public static int binarySearchTailRecursively(int[] array, int key, int lowestPosition, int highestPosition) {

        if (lowestPosition > highestPosition) return -1;

        var middle = Math.round((highestPosition + lowestPosition) / 2);

        if (key > array[middle])
            return binarySearchTailRecursively(array, key, middle + 1, highestPosition);
        else if (key < array[middle])
            return binarySearchTailRecursively(array, key, lowestPosition, middle - 1);
        else
            return middle;
    }

}

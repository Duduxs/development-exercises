package src.searches_and_sorts.exercises;

public class BuscaBinariaIterativa {

    void main() {
        var arr = new int[]{-5, 0, 2, 8, 13, 16, 19, 23, 29, 34, 38};
        System.out.println(binarySearch(arr, 34));
        System.out.println(binarySearch(arr, 16));
        System.out.println(binarySearch(arr, 8));
        System.out.println(binarySearch(arr, -6));
    }

    public static int binarySearch(int[] array, int key) {
        var lowestPosition = 0;
        var highestPosition = array.length - 1;

        while (highestPosition > lowestPosition) {
            var middle = Math.round((highestPosition + lowestPosition) / 2);

            if (key == array[middle]) return middle;
            else if (key > array[middle]) lowestPosition = middle + 1;
            else highestPosition = middle - 1;
        }

        return -1;
    }
}

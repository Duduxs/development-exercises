package src.algorithms_complexity.exercises;

public class OrdemLogaritmica {

    public static void main(String[] args) {
        var array = new int[]{7, 13, 20, 25, 28, 31, 35, 39, 40, 45, 46, 48, 57, 59, 63, 71};
        //System.out.println(find(array, 39)); // 7
        System.out.println(find(array, 46)); // 10
        System.out.println(find(array, 22)); // -1
    }

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

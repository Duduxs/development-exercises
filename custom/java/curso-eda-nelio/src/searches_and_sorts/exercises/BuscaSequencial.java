package src.searches_and_sorts.exercises;

public class BuscaSequencial {

    void main() {
        System.out.println(sequentialSearch(new int[]{28, 6, -2, 9, 16, 20, 23, 8}, 20));
    }

    public static int sequentialSearch(int[] arr, int key) {
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}

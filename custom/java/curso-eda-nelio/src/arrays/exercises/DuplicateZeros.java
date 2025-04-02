package src.arrays.exercises;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        var arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros2(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void duplicateZeros(int[] arr) {
        final var duplicatedZeroArray = new int[arr.length];
        var j = 0;

        for (var i = 0; i < arr.length && j < arr.length; i++) {
            if (arr[i] != 0) {
                duplicatedZeroArray[j++] = arr[i];
            } else {
                j += 2;
            }
        }

        for (var i = 0; i < arr.length; i++) {
            arr[i] = duplicatedZeroArray[i];
        }
    }

    public static void duplicateZeros2(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i + 1 < arr.length) {
                var nextElement = arr[i + 1];
                arr[i + 1] = 0;
                i++;
                for (var j = i + 1; j < arr.length; j++) {
                    var currentElement = arr[j];
                    arr[j] = nextElement;
                    nextElement = currentElement;
                }
            }
        }
    }
}

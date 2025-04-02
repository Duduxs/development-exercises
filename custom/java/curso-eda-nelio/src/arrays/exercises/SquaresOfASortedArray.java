package src.arrays.exercises;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        Arrays.stream(sortedSquares(new int[]{-4, -1, 0, 3, 10})).forEach(System.out::println);
        System.out.println();
        Arrays.stream(sortedSquares(new int[]{-7, -3, 2, 3, 11})).forEach(System.out::println);
    }

    public static int[] sortedSquares(final int[] nums) {
        final var result = new int[nums.length];

        for (var i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);

        return result;
    }
}

package leetcode.java.medium;

import java.util.Arrays;

public class TwoSum2 {

    //Brute force O(N²)
    public static int[] twoSum(int[] numbers, int target) {

        var result = new int[2];

        outerloop:
        for (var i = 0; i < numbers.length; i++) {

            for (var j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break outerloop;
                }
            }
        }

        return result;
    }

    //Two pointers
    //O(N)
    public static int[] twoSumPointers(int[] numbers, int target) {

        var i = 0;
        var j = numbers.length - 1;

        while (i < j) {

            var sum = numbers[i] + numbers[j];

            if (sum > target) j--;
            else if (sum < target) i++;
            else return new int[]{i + 1, j + 1};

        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        twoSum(new int[]{1, 2, 3, 4, 5, 6}, 3);
        System.out.println(Arrays.toString(twoSumPointers(new int[]{1, 2, 3, 4, 5, 6}, 3)));
    }
}

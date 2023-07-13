package leetcode.java.medium;

public class TwoSum2 {

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

    public static void main(String[] args) {
        twoSum(new int[]{1, 2, 3, 4, 5, 6}, 3);
    }
}

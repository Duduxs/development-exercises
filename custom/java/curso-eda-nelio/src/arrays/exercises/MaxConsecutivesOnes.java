package src.arrays.exercises;

public class MaxConsecutivesOnes {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutivesOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(findMaxConsecutivesOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    public static int findMaxConsecutivesOnes(int[] nums) {
        var qtd = 0;
        var maxValue = qtd;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                qtd++;
                if (qtd >= maxValue) {
                    maxValue = qtd;
                }
            } else {
                qtd = 0;
            }
        }

        return maxValue;
    }

    public static int findMaxConsecutivesOnesTwo(int[] nums) {
        var qtd = 0;
        var maxValue = qtd;

        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 1) qtd++;
            else qtd = 0;
            if (qtd >= maxValue) maxValue = qtd;
        }

        return maxValue;
    }

}

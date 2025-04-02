package src.arrays.exercises;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }

    public static int findNumbers(int[] nums) {
        var count = 0;

        for (var num : nums) {
            if (String.valueOf(num).length() % 2 == 0) count++;
        }

        return count;
    }

}

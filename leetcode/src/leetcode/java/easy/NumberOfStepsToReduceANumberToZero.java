package leetcode.java.easy;

public class NumberOfStepsToReduceANumberToZero {

    public static int numberOfSteps(int num) {

        var numbersOfSteps = 0;

        while (num != 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            numbersOfSteps++;
        }

        return numbersOfSteps;

    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

}

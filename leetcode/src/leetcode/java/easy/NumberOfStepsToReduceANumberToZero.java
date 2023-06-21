package leetcode.java.easy;

public class NumberOfStepsToReduceANumberToZero {

    public static int numberOfSteps(int num) {

        var numbersOfSteps = 0;
        var currentNumber = num;

        while (true) {

            if (currentNumber == 0) break;

            try {
                if (currentNumber % 2 == 0) {
                    currentNumber /= 2;
                } else {
                    currentNumber -= 1;
                }
            } finally {
                numbersOfSteps++;
            }

        }

        return numbersOfSteps;

    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

}

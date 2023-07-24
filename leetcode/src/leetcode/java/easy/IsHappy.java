package leetcode.java.easy;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

    public static boolean isHappy(int n) {
        if (n < 0) return false;

        Set<Integer> computedNumbers = new HashSet<>();

        while (n != 1) {

            var numbers = String.valueOf(n).split("");

            n = 0;

            for (var number : numbers) {
                var parsedNumber = Integer.valueOf(number);
                n += parsedNumber * parsedNumber;
            }

            if (computedNumbers.contains(n)) return false;
            else computedNumbers.add(n);
        }

        return true;

    }

    public static boolean isHappyTwo(int n) {
        if (n < 0) return false;

        Set<Integer> computedNumbers = new HashSet<>();
        var sum = 0;

        while (true) {

            sum = 0;

            while (n != 0) {
                var digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;

            if (n == 1) break;
            if (computedNumbers.contains(n)) return false;

            computedNumbers.add(n);

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isHappyTwo(19));
        System.out.println(isHappyTwo(78));
        System.out.println(isHappyTwo(7));

        System.out.println(isHappy(19));
        System.out.println(isHappy(78));
        System.out.println(isHappy(7));



    }

}

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

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(78));
        System.out.println(isHappy(7));

    }

}

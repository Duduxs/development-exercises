package leetcode.java.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        List<String> str = new ArrayList<>();

        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str.add("FizzBuzz");
            } else if (i % 3 == 0) {
                str.add("Fizz");
            } else if (i % 5 == 0) {
                str.add("Buzz");
            } else {
                str.add(String.valueOf(i));
            }
        }

        return str;

    }


    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }

}

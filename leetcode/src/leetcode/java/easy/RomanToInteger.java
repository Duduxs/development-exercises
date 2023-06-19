package leetcode.java.easy;

import java.util.*;
import java.util.stream.Collectors;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<String, Integer> romanNumbers = Map.ofEntries(
                Map.entry("I", 1),
                Map.entry("IV", 4),
                Map.entry("V", 5),
                Map.entry("IX", 9),
                Map.entry("X", 10),
                Map.entry("XL", 40),
                Map.entry("XC", 90),
                Map.entry("L", 50),
                Map.entry("C", 100),
                Map.entry("CD", 400),
                Map.entry("CM", 900),
                Map.entry("D", 500),
                Map.entry("M", 1000)
        );

        Queue<Character> chars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayDeque::new));

        List<Integer> numbers = new ArrayList<>();

        while (!chars.isEmpty()) {

            var currentChar = chars.poll();
            var nextChar = chars.peek();

            var romanNumber = romanNumbers.get(String.format("%c%c", currentChar, nextChar));

            if (romanNumber == null) {
                numbers.add(romanNumbers.get(String.valueOf(currentChar)));
                continue;
            }

            numbers.add(romanNumber);
            chars.remove();

        }

        return numbers.stream().reduce(Integer::sum).orElse(0);

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
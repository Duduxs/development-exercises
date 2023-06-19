package leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumbers = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );


        List<Integer> numbers = new ArrayList<>();

        while (true) {
            if(s.isEmpty()) break;
            var currentChar = s.charAt(0);
            var nextChar = 1 < s.length() ? s.charAt(1) : null;

            if(nextChar != null) {
                if (currentChar == 'I' && "VX".contains(nextChar.toString())) {
                    numbers.add(romanNumbers.get(nextChar) - romanNumbers.get(currentChar));
                    s = s.replace(String.format("%c%c",currentChar,nextChar), "");
                } else if(currentChar == 'X' && "LC".contains(nextChar.toString())) {
                    numbers.add(romanNumbers.get(nextChar) - romanNumbers.get(currentChar));
                    s = s.replace(String.format("%c%c",currentChar,nextChar), "");
                } else if(currentChar == 'C' && "DM".contains(nextChar.toString())) {
                    numbers.add(romanNumbers.get(nextChar) - romanNumbers.get(currentChar));
                    s = s.replace(String.format("%c%c",currentChar,nextChar), "");
                } else {
                    numbers.add(romanNumbers.get(currentChar));
                    s = s.replaceFirst(String.format("%c",currentChar),"");
                }
            } else {
                numbers.add(romanNumbers.get(currentChar));
                s = s.replaceFirst(String.format("%c",currentChar),"");
            }

        }

        return numbers.stream().reduce(Integer::sum).get();

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
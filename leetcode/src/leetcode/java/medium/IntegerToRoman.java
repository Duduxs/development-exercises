package leetcode.java.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        Map<String, Integer> data = new HashMap<>(
                Map.of(
                        "M", 1000,
                        "CM", 900,
                        "D", 500,
                        "CD", 400,
                        "C", 100,
                        "XC", 90,
                        "L", 50,
                        "XL", 40,
                        "X", 10,
                        "IX", 9
                ));

        data.putAll(Map.of("V", 5, "IV", 4, "III", 3, "II", 2, "I", 1));

        var convertedRoman = new StringBuilder();

        var sortedEntrySet = data.entrySet().stream().sorted(Comparator.comparingInt(x -> -x.getValue())).toList();

        for (var entry : sortedEntrySet) {

            while (num - entry.getValue() > 0) {
                num -= entry.getValue();
                convertedRoman.append(entry.getKey());
            }
            if (num - entry.getValue() == 0) {
                convertedRoman.append(entry.getKey());
                break;
            }
        }

        return convertedRoman.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(21));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
        System.out.println(intToRoman(3));
    }
}

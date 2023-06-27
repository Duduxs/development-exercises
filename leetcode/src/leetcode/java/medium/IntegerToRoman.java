package leetcode.java.medium;

import java.util.Comparator;
import java.util.Map;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        Map<Integer, String> data = Map.ofEntries(
                Map.entry(1000, "M"),
                Map.entry(900, "CM"),
                Map.entry(500, "D"),
                Map.entry(400, "CD"),
                Map.entry(100, "C"),
                Map.entry(90, "XC"),
                Map.entry(50, "L"),
                Map.entry(40, "XL"),
                Map.entry(10, "X"),
                Map.entry(9, "IX"),
                Map.entry(5, "V"),
                Map.entry(4, "IV"),
                Map.entry(1, "I")
        );

        var convertedRoman = new StringBuilder();

        var sortedEntrySet = data.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(x -> -x.getKey()))
                .toList();

        for (var entry : sortedEntrySet) {

            while (num - entry.getKey() > 0) {
                num -= entry.getKey();
                convertedRoman.append(entry.getValue());
            }

            if (num - entry.getKey() == 0) {
                convertedRoman.append(entry.getValue());
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

package leetcode.java.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ZigzagConversion {

    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> builders = new ArrayList<>();

        for (var i = 0; i < numRows; i++) {
            builders.add(new StringBuilder());
        }
        var index = 0;

        while (index < s.length()) {

            for (var row = 0; row < numRows && index < s.length(); row++) {
                builders.get(row).append(s.charAt(index));
                index++;
            }

            for (var diagonal = numRows - 2; diagonal > 0 && index < s.length(); diagonal--) {
                builders.get(diagonal).append(s.charAt(index));
                index++;
            }
        }


        return builders.stream().map(StringBuilder::toString).collect(Collectors.joining());

    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING", 4);
    }

}

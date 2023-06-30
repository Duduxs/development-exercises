package leetcode.java.medium;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        var values = s.split(" ");

        List<String> stringList = new ArrayList<>();

        for (var i = values.length - 1; i >= 0; i--) {
            if (values[i].contains(" ")) continue;
            stringList.add(values[i]);
        }

        return stringList.stream().map(String::strip).filter(x -> !x.equals("")).reduce((x, y) -> x + " " + y).orElse("");

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));

    }
}

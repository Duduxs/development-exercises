package leetcode.java.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {

        Deque<Character> foundVowels = new ArrayDeque<>();
        var newStr = new StringBuilder();

        List<Character> acceptableVogals = List.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');

        for (Character character : s.toCharArray()) {
            if (acceptableVogals.contains(character)) foundVowels.push(character);
        }

        for (Character character : s.toCharArray()) {

            if (acceptableVogals.contains(character)) {
                newStr.append(foundVowels.pop());
                continue;
            }

            newStr.append(character);
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
//        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aA"));

    }
}

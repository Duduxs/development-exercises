package leetcode.java.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {

        Deque<Character> foundVowels = new ArrayDeque<>();
        var newStr = new StringBuilder();

        List<Character> acceptableVogals = List.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');

        var chars = s.toCharArray();
        for (Character character : chars) {
            if (acceptableVogals.contains(character)) foundVowels.push(character);
        }

        for (Character character : chars) {

            if (acceptableVogals.contains(character)) {
                newStr.append(foundVowels.pop());
                continue;
            }

            newStr.append(character);
        }

        return newStr.toString();
    }

    public static String reverseVowels2(String s) {

        var start = 0;
        var end = s.length() - 1;

        var chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while (start < end) {

            if (vowels.indexOf(chars[start]) != -1 && vowels.indexOf(chars[end]) != -1) {
                var temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            } else if (vowels.indexOf(chars[start]) == -1) start++;
            else if (vowels.indexOf(chars[end]) == -1) end--;

        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels2("hello"));
        System.out.println(reverseVowels2("leetcode"));
        System.out.println(reverseVowels2("aA"));

    }
}

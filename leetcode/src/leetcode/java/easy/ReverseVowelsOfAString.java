package leetcode.java.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {

        Deque<Character> foundVowels = new ArrayDeque<>();
        var newStr = new StringBuilder();


        for (Character character : s.toCharArray()) {
            var characterLowercase = Character.toLowerCase(character);
            if (characterLowercase == 'a' || characterLowercase == 'e' || characterLowercase == 'i' || characterLowercase == 'o' || characterLowercase == 'u') {
                foundVowels.push(character);
            }
        }

        for (Character character : s.toCharArray()) {
            var characterLowercase = Character.toLowerCase(character);
            if (characterLowercase == 'a' || characterLowercase == 'e' || characterLowercase == 'i' || characterLowercase == 'o' || characterLowercase == 'u') {
                newStr.append(foundVowels.pop());
            } else {
                newStr.append(character);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
//        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aA"));

    }
}

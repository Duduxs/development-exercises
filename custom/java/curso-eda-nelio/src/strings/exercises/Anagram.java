package src.strings.exercises;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var first = s.toCharArray();
        var second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        for(var i = 0; i < first.length; i++) {
            if(first[i] != second[i]) return false;
        }

        return true;

    }

}

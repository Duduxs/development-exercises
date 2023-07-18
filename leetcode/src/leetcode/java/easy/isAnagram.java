package leetcode.java.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class isAnagram {

    public static boolean isAnagram(String s, String t) {

        if (t.length() != s.length()) return false;

        Queue<Character> pattern = new ArrayDeque<>();

        for (var c : s.toCharArray()) {
            pattern.add(c);
        }

        for (var i = 0; i < t.length(); i++) {
            if (!pattern.contains(t.charAt(i))) return false;
            pattern.remove(t.charAt(i));
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "ccac"));
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}

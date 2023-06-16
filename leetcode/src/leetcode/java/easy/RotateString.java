package leetcode.java.easy;

import java.util.List;
import java.util.stream.Collectors;

public class RotateString {

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    public static boolean rotateString(String s, String goal) {

        if (s.equals(goal)) return true;

        List<Character> string = s.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

        for (var i = 0; i < s.length(); i++) {
            string.remove(0);
            string.add(s.length() - 1, s.charAt(i));

            StringBuilder builder = new StringBuilder(s.length());

            for(Character c : string) { builder.append(c); }

            if (builder.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}

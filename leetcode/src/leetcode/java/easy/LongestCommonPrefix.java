package leetcode.java.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        var firstStringElement = strs[0];
        var lastStringElement = strs[strs.length - 1];
        var k = 0;

        while (k < firstStringElement.length()) {
            if (firstStringElement.charAt(k) == lastStringElement.charAt(k)) k++;
            else break;
        }

        return firstStringElement.substring(0, k);
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});

    }
}

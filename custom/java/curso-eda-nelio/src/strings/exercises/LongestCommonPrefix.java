package src.strings.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(findLongestCommonPrefix(new String[]{"flowers", "flow", "flight"}));
        System.out.println(findLongestCommonPrefix(new String[]{""}));
        System.out.println(findLongestCommonPrefix(new String[]{"a"}));
        System.out.println(findLongestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(findLongestCommonPrefix(new String[]{"ab", "a"}));

        System.out.println();

        System.out.println(findLongestCommonPrefix2(new String[]{"flowers", "flow", "flight"}));
        System.out.println(findLongestCommonPrefix2(new String[]{""}));
        System.out.println(findLongestCommonPrefix2(new String[]{"a"}));
        System.out.println(findLongestCommonPrefix2(new String[]{"dog", "racecar", "car"}));
        System.out.println(findLongestCommonPrefix2(new String[]{"ab", "a"}));

        System.out.println();

        System.out.println(findLongestCommonPrefix3(new String[]{"flowers", "flow", "flight"}));
        System.out.println(findLongestCommonPrefix3(new String[]{""}));
        System.out.println(findLongestCommonPrefix3(new String[]{"a"}));
        System.out.println(findLongestCommonPrefix3(new String[]{"dog", "racecar", "car"}));
        System.out.println(findLongestCommonPrefix3(new String[]{"ab", "a"}));
    }

    public static String findLongestCommonPrefix(String[] strs) {
        var sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        var i = 0;
        var j = 0;

        while (true) {
            var currentStr = strs[i];
            if (currentStr.length() == j) break;
            var currentChar = currentStr.charAt(j);
            i++;

            set.add(currentChar);

            if (i == strs.length) {
                if (set.size() == 1) {
                    sb.append(set.iterator().next());
                    set.clear();
                } else {
                    break;
                }

                i = 0;
                j++;
            }

        }

        return sb.toString();
    }

    public static String findLongestCommonPrefix2(String[] strs) {
        var sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        var i = 0;
        var j = 0;

        while (true) {
            var currentStr = strs[i];
            i++;

            if (currentStr.length() == j) break;

            char currentChar = currentStr.charAt(j);

            if (!set.isEmpty() && !set.contains(currentChar)) {
                break;
            }

            set.add(currentChar);

            if (i == strs.length) {
                sb.append(currentChar);
                set.clear();

                i = 0;
                j++;
            }
        }

        return sb.toString();
    }

    public static String findLongestCommonPrefix3(String[] strs) {
        var sb = new StringBuilder();

        Arrays.sort(strs);

        var first = strs[0];
        var last = strs[strs.length - 1];
        var smallestElementLength = Math.min(first.length(), last.length());

        for (var i = 0; i < smallestElementLength; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}

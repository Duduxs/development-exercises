package src.strings.exercises;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(findLongestCommonPrefix(new String[]{"flowers", "flow", "flight"}));
        System.out.println(findLongestCommonPrefix(new String[]{""}));
        System.out.println(findLongestCommonPrefix(new String[]{"a"}));
        System.out.println(findLongestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(findLongestCommonPrefix(new String[]{"ab", "a"}));
    }

    public static String findLongestCommonPrefix(String[] strs) {
        var sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        var i = 0;
        var j = 0;
        while (true) {
            var currentStr = strs[i];
            if(currentStr.length() == j) break;
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
}

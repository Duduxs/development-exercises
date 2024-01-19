package leetcode.java.medium;

import java.util.*;

public class BinaryTreeInorderTraversal {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            var currentWordCharacters = str.toCharArray();
            Arrays.sort(currentWordCharacters);
            var currentWord = String.valueOf(currentWordCharacters);

            groups.putIfAbsent(currentWord, new ArrayList<>());
            groups.get(currentWord).add(str);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}

package leetcode.java.easy;

import java.util.*;

public class ContainsDuplicateTwo {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, List<Integer>> numberToIndexes = new HashMap<>();

        for (var i = 0; i < nums.length; i++) {
            numberToIndexes.putIfAbsent(nums[i], new ArrayList<>());
            numberToIndexes.get(nums[i]).add(i);
        }

        for (var entry : numberToIndexes.entrySet()) {
            for (var i = 0; i < entry.getValue().size(); i ++) {
                for (var j = i + 1; j < entry.getValue().size(); j++) {
                    if (Math.abs(entry.getValue().get(i) - entry.getValue().get(j)) <= k) return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        System.out.println(containsNearbyDuplicate(new int[]{0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

}

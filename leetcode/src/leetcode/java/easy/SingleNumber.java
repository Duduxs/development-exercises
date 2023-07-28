package leetcode.java.easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numsToAppearanceTimes = new HashMap<>();

        for (var i = 0; i < nums.length; i++) {
            numsToAppearanceTimes.merge(nums[i], 1, Integer::sum);
        }

        return numsToAppearanceTimes.entrySet().stream().sorted(Map.Entry.comparingByValue()).findFirst().get().getKey();

    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }
}

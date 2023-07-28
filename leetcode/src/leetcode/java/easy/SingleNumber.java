package leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        List<Integer> candidates = new ArrayList<>();

        for (var i = 0; i < nums.length; i++) {
            if (candidates.contains(nums[i])) {
                candidates.remove((Integer) nums[i]);
            } else {
                candidates.add(nums[i]);
            }
        }

        return candidates.get(0);

    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }
}

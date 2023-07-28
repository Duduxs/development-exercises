package leetcode.java.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Set<Integer> candidates = new HashSet<>();

        for (int num : nums) {
            if (candidates.contains(num)) candidates.remove(num);
            else candidates.add(num);
        }

        return (Integer) candidates.toArray()[0];

    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }
}

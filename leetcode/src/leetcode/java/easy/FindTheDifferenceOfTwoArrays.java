package leetcode.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        final Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        final Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        final List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        nums1Set.forEach(num -> {
            if (!nums2Set.contains(num)) {
                result.getFirst().add(num);
            }
        });

        nums2Set.forEach(num -> {
            if (!nums1Set.contains(num)) {
                result.getLast().add(num);
            }
        });

        return result;
    }

}

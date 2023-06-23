package leetcode.java.easy;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        List<Integer> uniqueNumbers = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new)).stream().toList();

        for (var i = 0; i < nums.length; i++) {
            if(i < uniqueNumbers.size()) {
                nums[i] = uniqueNumbers.get(i);
            } else {
                nums[i] = 9999;
            }
        }

        return uniqueNumbers.size();

    }

    public static void main(String[] args) {
        var array = new int[]{-3, -1, 0, 0, 0, 3, 3};
        System.out.println(removeDuplicates(array));
        System.out.println();
        Arrays.stream(array).forEach(System.out::println);
    }
}

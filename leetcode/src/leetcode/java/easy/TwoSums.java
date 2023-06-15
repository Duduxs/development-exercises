package leetcode.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {

        List<Integer> indexes = new ArrayList<>();
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        outerloop:
        for (int i = 0; i < numList.size(); i++) {
            for (int j = i + 1; j < numList.size(); j++) {

                if (numList.get(i) + numList.get(j) == target) {
                    indexes.addAll(List.of(i, j));
                    break outerloop;
                }
            }
        }

        return indexes.stream().mapToInt(x -> x).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}
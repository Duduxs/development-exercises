package leetcode.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {

        List<Integer> indexes = new ArrayList<>();
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        boolean indexesGotten = false;

        for (int i = 0; i < numsList.size(); i++) {

            if(indexesGotten) break;

            for (int j = i+1; j < numsList.size(); j++) {

                if (numsList.get(i) + numsList.get(j) == target) {
                    indexes.add(i);
                    indexes.add(j);
                    indexesGotten = true;
                }
                if(indexesGotten) break;
            }
        }

        return indexes.stream().mapToInt(x -> x).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

}
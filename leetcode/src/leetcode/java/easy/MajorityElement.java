package leetcode.java.easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementsToTotalOccurrencesFoundsInArray = new HashMap<>();

        for (var num : nums) {
            elementsToTotalOccurrencesFoundsInArray.merge(num, 1, Integer::sum);
        }

        return elementsToTotalOccurrencesFoundsInArray.entrySet()
                .stream().sorted(Comparator.comparingInt(x -> -x.getValue()))
                .findFirst().get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 3,2,3 }));
    }

}

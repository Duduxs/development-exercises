package leetcode.java.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementsToTotal = new HashMap<>();

        for (var num : nums) {
            if (elementsToTotal.containsKey(num)) {
                var current = elementsToTotal.get(num) + 1;
                elementsToTotal.remove(num);
                elementsToTotal.put(num, current);
            } else {
                elementsToTotal.put(num, 1);
            }
        }

        var greatestElement = 0;
        var greatestKey = 0;

        for(var map : elementsToTotal.entrySet()) {
            if(map.getValue() > greatestElement) {
                greatestElement = map.getValue();
                greatestKey = map.getKey();
            }
        }

        return greatestKey;


    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 3,2,3 }));
    }

}

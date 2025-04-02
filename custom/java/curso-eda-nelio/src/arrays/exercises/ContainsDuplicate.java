package src.arrays.exercises;

import java.util.Arrays;

//Implement a solution only with arrays
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (var i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        for (var i = 0; i < nums.length; i++) {
            for(var j = i + 1 ; j < nums.length ; j++) {
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

}

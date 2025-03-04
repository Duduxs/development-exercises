package leetcode.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {
    public static void main(String[] args) {
       moveZeroes(new int[] { 0, 1, 0 ,3 ,12 });
    }

    public static void moveZeroes(int[] nums) {
        var zeroesQuantities = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (num == 0) zeroesQuantities++;
            else numbers.add(num);
        }

        while(zeroesQuantities != 0) {
            numbers.add(0);
            zeroesQuantities--;
        }

        for(var i = 0 ; i < nums.length ; i++) {
            nums[i] = numbers.get(i);
        }
    }
}

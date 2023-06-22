package leetcode.java.easy;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int[] arrayWithRemovedData = Arrays.stream(nums).boxed().filter(x -> x != val)
                .mapToInt(Integer::intValue)
                .toArray();

        System.arraycopy(arrayWithRemovedData, 0, nums, 0, arrayWithRemovedData.length);

        return arrayWithRemovedData.length;

    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] { 3,2,2,3}, 3));
    }

}

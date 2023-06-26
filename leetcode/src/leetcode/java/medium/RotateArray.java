package leetcode.java.medium;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        var arrays = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arrays, 3);
        var array = new int[]{1, 2};
        rotate(array, 3);
        var array2 = new int[]{-1, -100, 3, 99};
        rotate(array2, 2);
    }
}

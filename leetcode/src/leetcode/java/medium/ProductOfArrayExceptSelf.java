package leetcode.java.medium;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        var leftData = new int[nums.length];
        var leftProduct = 1;

        for (var i = 0; i < nums.length; i++) {
            leftData[i] = leftProduct;
            leftProduct *= nums[i];
        }

        var rightData = new int[nums.length];
        var rightProduct = 1;

        for (var i = nums.length - 1; i >= 0; i--) {
            rightData[i] = rightProduct;
            rightProduct *= nums[i];
        }

        for (var i = 0; i < nums.length; i++) {
            nums[i] = rightData[i] * leftData[i];
        }

        return nums;
    }


    public static void main(String[] args) {
        productExceptSelf(new int[]{1, 2, 3, 4});
    }

}

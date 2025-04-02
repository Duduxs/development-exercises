package src.arrays.exercises;

public class DotProductTwoArrays {

    public static void main(String[] args) {
        System.out.println(dotProduct(new int[]{1, 0, 0, 2, 3}, new int[]{0, 3, 0, 4, 0}));
        System.out.println(dotProduct(new int[]{0, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 2}));
        System.out.println(dotProduct(new int[]{0, 1, 0, 0, 2, 0, 0}, new int[]{1, 0, 0, 0, 3, 0, 4}));
    }

    public static int dotProduct(int[] nums1, int[] nums2) {
        var result = 0;
        for (var i = 0; i < nums1.length; i++) {
            result += nums1[i] * nums2[i];
        }
        return result;
    }
}

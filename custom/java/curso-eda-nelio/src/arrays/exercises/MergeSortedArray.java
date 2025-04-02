package src.arrays.exercises;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        var nums1 = new int[]{1, 2, 3, 0 ,0, 0};
        merge(nums1, 3, new int[] {2 ,5 ,6 }, 3);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        var j = 0;
        for (var i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && j < nums2.length) {
                nums1[i] = nums2[j++];
            }
        }

        Arrays.sort(nums1);
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (var i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

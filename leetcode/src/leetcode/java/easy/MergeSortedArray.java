package leetcode.java.easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        Queue<Integer> data = new ArrayDeque<>();

        for (var element : nums2) {
            data.add(element);
        }

        for (var i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = data.size() > 0 ? data.poll() : 0 ;
            }
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

    }
}

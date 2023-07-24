package leetcode.java.easy;

public class SearchInsertPosition {

    //Binary Search BIG O(LOG N)
    public static int searchInsert(int[] nums, int target) {

        var firstPosition = 0;
        var lastPosition = nums.length - 1;

        while (firstPosition <= lastPosition) {

            var mid = firstPosition + (lastPosition - firstPosition) / 2;

            if (target > nums[mid]) firstPosition = mid + 1;
            else if (target < nums[mid]) lastPosition = mid - 1;
            else return mid;
        }

        return firstPosition;
    }

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));


        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 6));
    }
}

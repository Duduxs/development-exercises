package leetcode.java.medium;

public class JumpGame {

    public static boolean canJump(int[] nums) {

//        [2, 3, 1, 0, 4]
//        [2, 3, 1, 2, 0, 4]
//        [2, 3, 1, 6, 1, 0, 4]

        var boundary = 0;
        for (var i = 0; i < nums.length; i++) {
            if (boundary < i) return false;
            boundary = Math.max(boundary, i + nums[i]);
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{4, 2, 0, 0, 1, 1, 4, 4, 4, 0, 4, 0}));
        System.out.println(canJump(new int[]{1, 2, 0, 1, 10, 0, 0, 1, 1000, 0, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3}));

        System.out.println(canJump(new int[]{1, 1, 1, 0}));

        System.out.println(canJump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}));

        System.out.println(canJump(new int[]{2, 3, 1, 2, 0, 4}));
        System.out.println(canJump(new int[]{2, 3, 1, 6, 1, 0, 4}));
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(canJump(new int[]{1, 1, 0, 1}));

        System.out.println(canJump(new int[]{2, 3, 1, 0, 4}));

    }

}

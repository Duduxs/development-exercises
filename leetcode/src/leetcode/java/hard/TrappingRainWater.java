package leetcode.java.hard;

import java.util.Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {

        var maximumLefts = new int[height.length];
        var maximumRights = new int[height.length];
        var water = new int[height.length];

        for (var i = 0; i < height.length; i++) {

            if (i == 0) {
                maximumLefts[i] = height[i];
            }

            if (i > 0) {
                maximumLefts[i] = Math.max(height[i], maximumLefts[i - 1]);
            }
        }

        for (var i = height.length - 1; i >= 0; i--) {

            if (i == height.length - 1) {
                maximumRights[i] = height[i];
            }

            if (i < height.length - 1) {
                maximumRights[i] = Math.max(height[i], maximumRights[i + 1]);
            }
        }

        for(var i = 0 ; i < height.length ; i++) {
            water[i] = Math.min(maximumLefts[i], maximumRights[i]) - height[i];
        }

        return Arrays.stream(water).reduce(Integer::sum).orElse(0);
    }

    public static void main(String[] args) {
        trap(new int[]{3, 1, 2, 4, 0, 1, 3, 2});
        trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }
}

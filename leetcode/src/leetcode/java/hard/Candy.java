package leetcode.java.hard;

import java.util.Arrays;

public class Candy {

    public static int candy(int[] ratings) {

        var candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (var i = 0; i < ratings.length; i++) {
            if (i - 1 >= 0 && ratings[i] > ratings[i - 1]) {
                if (candies[i - 1] + 1 > candies[i]) {
                    candies[i] = candies[i - 1] + 1;
                }
            }
        }

        for (var i = ratings.length - 1; i >= 0; i--) {
            if (i + 1 < ratings.length && ratings[i] > ratings[i + 1]) {
                if (candies[i + 1] + 1 > candies[i]) {
                    candies[i] = candies[i + 1] + 1;
                }
            }
        }

        return Arrays.stream(candies).reduce(Integer::sum).orElse(0);

    }

    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 3, 4, 5, 2}));
        System.out.println(candy(new int[]{1, 2, 2}));
        System.out.println(candy(new int[]{12, 4, 3, 11, 34, 34, 1, 67}));
    }
}

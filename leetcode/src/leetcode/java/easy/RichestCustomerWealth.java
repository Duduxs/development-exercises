package leetcode.java.easy;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        var maxWealth = 0;

        for (int[] clientAccount : accounts) {
            var currentClientWealth = Arrays.stream(clientAccount).reduce(Integer::sum).orElse(0);

            if (currentClientWealth > maxWealth) {
                maxWealth = currentClientWealth;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        var matrix = new int[][]{{1, 2, 3}, {3, 2, 1}};
        var matrixx = new int[][]{{1, 5}, {7, 3}, {3, 5}};

        System.out.println(maximumWealth(matrix));
        System.out.println(maximumWealth(matrixx));
    }

}

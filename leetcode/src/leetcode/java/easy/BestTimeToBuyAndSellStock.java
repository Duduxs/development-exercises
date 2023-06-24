package leetcode.java.easy;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        var lessPriceSeen = prices[0];
        var maxPriceSeen = 0;

        for (var i = 0; i < prices.length; i++) {

            if (prices[i] < lessPriceSeen) {
                lessPriceSeen = prices[i];
            }

            var calc = i + 1 == prices.length ? 0 : prices[i + 1] - lessPriceSeen;

            if (calc > maxPriceSeen) {
                maxPriceSeen = calc;
            }

        }
        return maxPriceSeen;

    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{2, 4, 1,}));
        System.out.println(maxProfit(new int[]{2, 4, 1, 2}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}));
    }

}

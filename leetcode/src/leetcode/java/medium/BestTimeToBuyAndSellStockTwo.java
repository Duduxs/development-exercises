package leetcode.java.medium;

public class BestTimeToBuyAndSellStockTwo {

    public static int maxProfit(int[] prices) {
        var minProfit = Integer.MAX_VALUE;
        var maxProfit = 0;
        for (var i = 0; i < prices.length; i++) {

            minProfit = prices[i];

            var profitCalc = i == prices.length - 1 ? 0 : prices[i + 1] - minProfit;

            if (profitCalc > 0) {
                maxProfit += profitCalc;
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}

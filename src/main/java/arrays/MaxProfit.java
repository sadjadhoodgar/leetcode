package arrays;

/**
 * LeetCode Problem #121: Best Time to buy and sell stock.
 * Link: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">...</a>
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
            return 0;
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < min){
                min = price;
            }else{
                max = Math.max(max, price - min);
            }
        }

        return max;
    }
}

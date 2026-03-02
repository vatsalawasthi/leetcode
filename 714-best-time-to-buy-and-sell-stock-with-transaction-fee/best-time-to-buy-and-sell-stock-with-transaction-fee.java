class Solution {
    public int maxProfit(int[] prices, int fee) {
        int x = -prices[0];
        int profit = 0;

        for(int i = 1; i<prices.length; i++){
            profit = Math.max(profit, x + prices[i] - fee);
            x = Math.max(x, profit - prices[i]);
        }
        return profit;
    }
}
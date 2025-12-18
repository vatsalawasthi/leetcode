class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

        long[] prefOrig = new long[n + 1];
        long[] prefPrice = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefOrig[i + 1] = prefOrig[i] + (long) strategy[i] * prices[i];
            prefPrice[i + 1] = prefPrice[i] + prices[i];
        }

        long baseProfit = prefOrig[n];
        long maxProfit = baseProfit;

        for (int l = 0; l + k <= n; l++) {
            int mid = l + k / 2;
            int r = l + k;

            long removeSum = prefOrig[r] - prefOrig[l];
            long addSum = prefPrice[r] - prefPrice[mid];

            long profit = baseProfit - removeSum + addSum;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}


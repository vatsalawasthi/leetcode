class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;

        for (int cost : costs) {
            max = Math.max(max, cost);
        }

        int[] count = new int[max + 1];

        for (int cost : costs) {
            count[cost]++;
        }

        int bars = 0;

        for (int cost = 1; cost <= max; cost++) {
            if (count[cost] == 0) continue;

            int canBuy = Math.min(count[cost], coins / cost);

            bars += canBuy;
            coins -= canBuy * cost;

            if (coins < cost) break;
        }

        return bars;
    }
}
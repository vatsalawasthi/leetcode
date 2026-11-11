class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans1 = (long) need1 * cost1 + (long) need2 * cost2;
        long ans2 = (long) Math.min(need1, need2) * costBoth
                  + (long) Math.max(0, need1 - need2) * cost1
                  + (long) Math.max(0, need2 - need1) * cost2;
        long ans3 = (long) Math.max(need1, need2) * costBoth;
        return Math.min(ans1, Math.min(ans2, ans3));
    }
}
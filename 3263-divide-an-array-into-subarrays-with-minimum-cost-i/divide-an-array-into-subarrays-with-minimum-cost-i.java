class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;

        int minPrefix = nums[1];

        int best = Integer.MAX_VALUE;

        for (int j = 2; j < n; j++) {
            best = Math.min(best, minPrefix + nums[j]);
            minPrefix = Math.min(minPrefix, nums[j]);
        }

        return nums[0] + best;
    }
}

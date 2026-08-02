class Solution {
    public long maxAlternatingSum(int[] nums) {
        Long[][] dp = new Long[nums.length][2];
        return solve(0, 1, nums, dp);
    }

    private long solve(int idx, int flag, int[] nums, Long[][] dp) {
        if (idx == nums.length) {
            return 0;
        }

        if (dp[idx][flag] != null) {
            return dp[idx][flag];
        }
        long skip = solve(idx + 1, flag, nums, dp);

        long take;
        if (flag == 1) {
            take = nums[idx] + solve(idx + 1, 0, nums, dp);
        } else {
            take = -nums[idx] + solve(idx + 1, 1, nums, dp);
        }

        return dp[idx][flag] = Math.max(skip, take);
    }
}
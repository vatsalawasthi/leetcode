class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[2501][2501];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, 0, -1, dp);
    }

    private int solve(int[] nums, int i, int p, int[][] dp) {
        if (i >= nums.length) {
            return 0;
        }

        if (p != -1 && dp[i][p] != -1) {
            return dp[i][p];
        }

        int take = 0;
        if (p == -1 || nums[i] > nums[p]) {
            take = 1 + solve(nums, i + 1, i, dp);
        }

        int skip = solve(nums, i + 1, p, dp);

        int ans = Math.max(take, skip);

        if (p != -1) {
            dp[i][p] = ans;
        }

        return ans;
    }
}
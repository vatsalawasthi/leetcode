class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] ans = new long[k];
        long[] prev = new long[k];

        for (int i = 0; i < n; i++) {
            long[] curr = new long[k];

            int currrem = nums[i] % k;
            curr[currrem]++;

            for (int oldrem = 0; oldrem < k; oldrem++) {
                int newrem = (int)((long) oldrem * nums[i] % k);

                curr[newrem] += prev[oldrem];
            }

            prev = curr;

            for (int x = 0; x < k; x++) {
                ans[x] += prev[x];
            }
        }
        return ans;
    }
}
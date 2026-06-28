class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int n = nums.length;
        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? Integer.MAX_VALUE : nums[i - 1];
            int right = (i == n - 1) ? Integer.MAX_VALUE : nums[i + 1];

            int need = Math.max(0, nums[i] - Math.min(left, right) + 1);

            if (i % 2 == 0)
                even += need;   
            else
                odd += need;
        }
        return Math.min(even, odd);
    }
}
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int count = k; // start as if we already have enough zeros before first 1

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                if (count < k) {
                    return false;   // not enough zeros since last 1
                }
                count = 0; // reset after finding a 1
            } else {
                count++; // count zeros between ones
            }
        }

        return true;
    }
}

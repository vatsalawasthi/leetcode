class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < n; i++) {
                if (nums[i] == original) {
                    original *= 2;
                    changed = true;   // restart the scan
                }
            }
        }

        return original;
    }
}

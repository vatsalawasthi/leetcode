class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int left = -1, right = -1;
        int maxSeen = Integer.MIN_VALUE;
        int minSeen = Integer.MAX_VALUE;

        // finding right boundary
        for (int i = 0; i < n; i++) {
            maxSeen = Math.max(maxSeen, nums[i]);
            if (nums[i] < maxSeen) {
                right = i;
            }
        }

        // finding left boundary
        for (int i = n - 1; i >= 0; i--) {
            minSeen = Math.min(minSeen, nums[i]);
            if (nums[i] > minSeen) {
                left = i;
            }
        }

        if (left == -1) return 0;

        return right - left + 1;
    }

    private void swap(int[] nums, int a, int b) {   
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}


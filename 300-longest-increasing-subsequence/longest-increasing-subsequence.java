class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] tails = new int[n];
        int size = 0;

        int i = 0;
        while (i < n) {
            int x = nums[i];

            // Binary search on tails[]
            int l = 0, r = size;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (tails[mid] < x) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }

            tails[l] = x;
            if (l == size) size++;

            i++;
        }

        return size;
    }
}


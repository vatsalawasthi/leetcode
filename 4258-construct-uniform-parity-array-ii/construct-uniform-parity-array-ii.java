class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;

        for (int x : nums1) {
            min = Math.min(min, x);
        }

        // If minimum is odd, we can make every element odd
        if (min % 2 != 0) {
            return true;
        }

        // If minimum is even, every element must already be even
        for (int x : nums1) {
            if (x % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
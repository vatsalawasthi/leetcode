class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = nums[0];
        int max = nums[0];

        int maxIndexfromfront = 0;
        int maxIndexfromback = 0;
        int minIndexfromfront = 0;
        int minIndexfromback = 0;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == min) {
                minIndexfromfront = i + 1;
                minIndexfromback = n - i;
            }

            if (nums[i] == max) {
                maxIndexfromfront = i + 1;
                maxIndexfromback = n - i;
            }
        }

        // Both removed from front
        int option1 = Math.max(minIndexfromfront, maxIndexfromfront);

        // Both removed from back
        int option2 = Math.max(minIndexfromback, maxIndexfromback);

        // One removed from front, other from back
        int option3 = Math.min(minIndexfromfront + maxIndexfromback,
                               maxIndexfromfront + minIndexfromback);

        return Math.min(option1, Math.min(option2, option3));
    }
}
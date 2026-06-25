class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum % 10 == x) {
                    long t = sum;

                    while (t >= 10) {
                        t /= 10;
                    }

                    int firstDigit = (int) t;

                    if (firstDigit == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
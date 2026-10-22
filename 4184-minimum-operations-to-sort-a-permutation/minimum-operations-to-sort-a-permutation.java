
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        for (int k = 0; k < n; k++) {
            boolean sorted = true;

            for (int i = 0; i < n; i++) {
                if (nums[(i + k) % n] != i) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return Math.min(k, n - k + 2);
            }
        }

        int[] rev = new int[n];

        for (int i = 0; i < n; i++) {
            rev[i] = nums[n - 1 - i];
        }

        for (int k = 0; k < n; k++) {
            boolean sorted = true;

            for (int i = 0; i < n; i++) {
                if (rev[(i + k) % n] != i) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return Math.min(k + 1, n - k + 1);
            }
        }

        return -1;
    }
}

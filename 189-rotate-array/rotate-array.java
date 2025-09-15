class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // normalize k

        // Step 1: reverse whole array
        swap(nums, 0, n - 1);

        // Step 2: reverse first k elements
        swap(nums, 0, k - 1);

        // Step 3: reverse last n-k elements
        swap(nums, k, n - 1);
    }

    private void swap(int[] nums, int a, int b) {
        while (a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}


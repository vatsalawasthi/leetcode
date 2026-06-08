class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        int j = 0, k = 0;
        int pivotCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                left[j++] = nums[i];
            } else if (nums[i] > pivot) {
                right[k++] = nums[i];
            } else {
                pivotCount++;
            }
        }
        int idx = 0;
        for (int i = 0; i < j; i++) {
            ans[idx++] = left[i];
        }

        for (int i = 0; i < pivotCount; i++) {
            ans[idx++] = pivot;
        }

        for (int i = 0; i < k; i++) {
            ans[idx++] = right[i];
        }
        return ans;
    }
}
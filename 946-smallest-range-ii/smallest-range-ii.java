import java.util.Arrays;

class Solution {
    public int smallestRangeII(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n-1] - nums[0];

        for(int mid = 0; mid < n-1; mid++){

            int[] temp = nums.clone();

            for(int i = 0; i <= mid; i++){
                temp[i] = temp[i] + k;
            }

            for(int i = mid + 1; i < n; i++){
                temp[i] = temp[i] - k;
            }

            Arrays.sort(temp);

            int range = temp[n-1] - temp[0];
            ans = Math.min(ans, range);
        }

        return ans;
    }
}
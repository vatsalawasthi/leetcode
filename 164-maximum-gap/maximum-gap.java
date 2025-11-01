class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxDiff = 0;
        for(int i = 1; i<n; i++){
            maxDiff = Math.max(maxDiff, nums[i] - nums[i-1]);
        }
        return maxDiff;
    }
}
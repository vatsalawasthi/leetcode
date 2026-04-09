class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;

        for(int i = 1; i<n; i++){
            if(nums[i]<=nums[i-1]){
                int need = nums[i-1] + 1;
                count += need - nums[i];
                nums[i] = need;
            }
        }
        return count;
    }
}
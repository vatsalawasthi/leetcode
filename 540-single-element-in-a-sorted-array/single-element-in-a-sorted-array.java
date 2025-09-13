class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<=n;i+=2){
            if(i==n-1 || nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
            return -1;
    }
}
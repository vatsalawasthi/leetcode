class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        for(int n : nums){
            sum += n;
        }
        int sumbeforePivot = 0;

        for(int i = 0; i<nums.length; i++){
            int sumafterPivot = sum - nums[i] - sumbeforePivot;
            if(sumbeforePivot == sumafterPivot){
                return i;
            }
            sumbeforePivot += nums[i];
        }
        return -1;
    }
}
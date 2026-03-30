class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int min = 0; int max = 0;

        for(int j = indexDifference; j<nums.length; j++){
            int i = j - indexDifference;

            if(nums[i]<nums[min]){
                min = i;
            }
            if(nums[i]>nums[max]){
                max = i;
            }
            if(Math.abs(nums[j] - nums[min]) >= valueDifference
){
    return new int[]{min, j};
}
if(Math.abs(nums[j] - nums[max]) >= valueDifference
){
    return new int[]{max, j};
}
        }
        return new int[]{-1, -1};
    }
}
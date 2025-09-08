class Solution {
    public int thirdMax(int[] nums) {
         int n = nums.length;
         Arrays.sort(nums);
         
         int[] temp = new int[n];
         int j = 0;
         temp[j++] = nums[0];
         for(int i = 1; i<n; i++){
            if(nums[i] != nums[i-1]){
                temp[j++] = nums[i];
            }
         }
         if(j<3){
            return temp[j-1];
         }else{
            return temp[j-3];
         }
    }
}
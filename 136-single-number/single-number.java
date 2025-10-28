class Solution {
    public int singleNumber(int[] nums) {

        // for(int i = 0; i<n; i++){
        //     boolean isUnique = true;
        //     for(int j = 0; j<n; j++){
        //         if (i != j && nums[i] == nums[j]) {
        //             isUnique = false;
        //             break;
        //         }
        //     }
        //         if (isUnique) {
        //         return nums[i];
        //     }
        // }
        // return -1;
        int unique = 0;
        for(int n : nums){
            unique^=n;
        }
        return unique;
    }
}
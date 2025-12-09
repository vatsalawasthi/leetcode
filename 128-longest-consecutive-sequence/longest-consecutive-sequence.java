class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;   // MISSING CASE

        Arrays.sort(nums);
        int n = nums.length;

        int count = 1;       // current streak
        int maxCount = 1;    // MISSING VARIABLE

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){    // HANDLE DUPLICATES
                continue;
            }

            if(nums[i] == nums[i-1] + 1){
                count++;
            } else {
                count = 1;               // MISSING RESET
            }

            maxCount = Math.max(maxCount, count); // UPDATE MAX
        }

        return maxCount;   // NOT 'count'
    }
}

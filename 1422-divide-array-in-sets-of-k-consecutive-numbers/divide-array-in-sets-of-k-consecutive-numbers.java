class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0){
            return false;
        }
        int count = 0;
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            int prev = nums[i];
            count = 1;

            for(int j = i+1; j<nums.length && count<k; j++){
                if(!used[j] && nums[j] == prev + 1){
                    used[j] = true;
                    prev = nums[j];
                    count++;
                }
            }
            if(count != k){
                return false;
            }
        }
        return true;
    }
}
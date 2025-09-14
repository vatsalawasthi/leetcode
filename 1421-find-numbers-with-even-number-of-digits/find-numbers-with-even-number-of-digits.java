class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(check(nums[i])){
                count++;
            }
        }
        return count;
    }
        private boolean check(int number){
            int digits = 0;
            while (number > 0) {
            digits++;
            number /= 10;
        }
        return digits % 2 == 0;
        }
    }
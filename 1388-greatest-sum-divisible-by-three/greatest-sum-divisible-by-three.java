class Solution {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int sum = 0;

        Arrays.sort(nums);

        int minRem1a = Integer.MAX_VALUE, minRem1b = Integer.MAX_VALUE;
        int minRem2a = Integer.MAX_VALUE, minRem2b = Integer.MAX_VALUE;

        for(int x : nums){
            sum += x;
            if(x % 3 == 1){
                if(x < minRem1a){ minRem1b = minRem1a; minRem1a = x; }
                else if(x < minRem1b){ minRem1b = x; }
            }
            else if(x % 3 == 2){
                if(x < minRem2a){ minRem2b = minRem2a; minRem2a = x; }
                else if(x < minRem2b){ minRem2b = x; }
            }
        }

        if(sum % 3 == 0) return sum;

        if(sum % 3 == 1){
            int option1 = (minRem1a == Integer.MAX_VALUE ? 0 : sum - minRem1a);
            int option2 = (minRem2a == Integer.MAX_VALUE || minRem2b == Integer.MAX_VALUE ? 
                           0 : sum - minRem2a - minRem2b);
            return Math.max(option1, option2);
        }

        // sum % 3 == 2
        int option1 = (minRem2a == Integer.MAX_VALUE ? 0 : sum - minRem2a);
        int option2 = (minRem1a == Integer.MAX_VALUE || minRem1b == Integer.MAX_VALUE ?
                       0 : sum - minRem1a - minRem1b);
        return Math.max(option1, option2);
    }
}


class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int k = 1; k<=n; k++){
            if(n % k != 0){
                continue;
            }
            boolean possible = true;
            int prevMax = Integer.MIN_VALUE;
            for(int i = 0; i<n; i+=k){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int descents = 0;

                for(int j = i; j<i+k; j++){
                    min = Math.min(min, nums[j]);
                    max = Math.max(max, nums[j]);

                    if (j > i && nums[j - 1] > nums[j]){
                        descents++;
                }
            }
            if (nums[i + k - 1] > nums[i]) {
                    descents++;
                }
                if (descents > 1 || prevMax > min) {
                    possible = false;
                    break;
                }
                prevMax = max;
            }
            if(possible){
                sum+=k;
            }
        }
        return sum;
    }
}
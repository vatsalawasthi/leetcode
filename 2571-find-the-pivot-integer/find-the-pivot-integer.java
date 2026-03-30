class Solution {
    public int pivotInteger(int n) {
        int[] nums = new int[1001];

        for(int i = 1; i <= n; i++){
            nums[i] = i;
        }

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += nums[i];
        }

        int sumbeforePivot = 0;
        for(int i = 1; i <= n; i++){
            int sumafterPivot = sum - nums[i] - sumbeforePivot;

            if(sumbeforePivot == sumafterPivot){
                return nums[i];
            }

            sumbeforePivot += nums[i];
        }

        return -1;
    }
}
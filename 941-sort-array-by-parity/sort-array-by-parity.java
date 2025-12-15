class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] even = new int[n];
        int[] odd = new int[n];
        int e = 0, o = 0;

        for(int i = 0; i<n; i++){
            if(nums[i]%2==0){
                even[e++] = nums[i];
            }else{
                odd[o++] = nums[i];
            }
        }
        int[] result = new int[n];
        int idx = 0;

        for (int i = 0; i < e; i++) {
            result[idx++] = even[i];
        }

        for (int i = 0; i < o; i++) {
            result[idx++] = odd[i];
        }

        return result;
    }
}
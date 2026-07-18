class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];

        for(int i = 0; i<n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(max, min);
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
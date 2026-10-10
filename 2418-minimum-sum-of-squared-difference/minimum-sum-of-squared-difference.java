class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] diff = new int[100001];
        int k = k1+k2;
        long sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            int x = Math.abs(nums1[i]-nums2[i]);
            sum += x;
            diff[x]++;
            max = Math.max(max,x);
        }

        if(sum <= k){
            return 0;
        }
        for(int i = max ; i > 0 && k > 0; i--){
            long move = Math.min(k,(long)diff[i]);
            diff[i] -= move;
            diff[i-1] += move;
            k -= move;
        }
        long ans = 0;
        for(int i = 0;i<=max ;i++){
            ans += (long)i*i*diff[i]; 
        }
        return ans;
    }
}
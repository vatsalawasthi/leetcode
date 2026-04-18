class Solution {
    public int mirrorDistance(int n) {
       int q = n;
        int reverse = 0;
        int ans;

        while(q!=0){
            int rem = q%10;
            reverse = reverse * 10 + rem;
            q = q/10;
        }
        ans = Math.abs(n-reverse);
        
        return ans;
    }
}
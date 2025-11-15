class Solution {
    public int reverse(int x) {
        int q = x;
        int result = 0;

        while(q!=0){
            int rem = q%10;

            if (result > Integer.MAX_VALUE / 10 || 
                result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            
            result = result*10 + rem;
            q = q/10;
        }
        return result;
    }
}
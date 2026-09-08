class Solution {
    public int countCommas(int n) {
       int count = 0;

       for(int i = 1; i<=n; i++){
           int digit = String.valueOf(i).length();
           count += (digit-1)/3;
       }
        return count;
    }
}
class Solution {
    public int numSub(String s) {
        int n = s.length();
        long count = 0; 
        long curr = 0;  

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                curr++;             
                count += curr;      
            } else {
                curr = 0;           
            }
        }

        return (int)(count % 1000000007); 
    }
}

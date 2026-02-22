class Solution {
    public int binaryGap(int n) {
        int len = -1;      
        int maxLen = 0;
        String binaryString = Integer.toBinaryString(n);

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (len != -1) {
                    maxLen = Math.max(maxLen, i - len);
                }
                len = i;   
            }
        }
        return maxLen;
    }
}
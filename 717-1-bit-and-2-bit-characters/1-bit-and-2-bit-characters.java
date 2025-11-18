class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;

        while (i < n - 1) {      // stop before last index
            if (bits[i] == 1) {
                i += 2;          // two-bit character
            } else {
                i += 1;          // one-bit character
            }
        }

        if(i==n-1){
            return true;
        }
        return false;
    }
}

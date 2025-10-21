class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        int result = 0;

        for(int i = 0; i<32; i++){
            result <<= 1; //makes space in result
            result |= (n&1); //add rightmost bit in result
            n >>=1; //right shift  to elimate the used bit
        }
        return result;
    }
}
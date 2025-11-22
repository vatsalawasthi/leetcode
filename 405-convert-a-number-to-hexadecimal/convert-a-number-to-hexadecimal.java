class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        char[] map = {
            '0','1','2','3','4','5','6','7','8','9',
            'a','b','c','d','e','f'
        };

        // handle negative numbers with 2's complement (32-bit unsigned)
        long n = num & 0xffffffffL;

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int digit = (int)(n & 15);   // get last 4 bits
            sb.append(map[digit]);
            n >>>= 4;                    // unsigned right shift
        }

        return sb.reverse().toString();
    }
}

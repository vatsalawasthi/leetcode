class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long squareSecond = c - a * a;
            long b = (long) Math.sqrt(squareSecond);
            if (b * b == squareSecond) {
                return true;
            }
        }
        return false;
    }
}
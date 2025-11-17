class Solution {
    public boolean isHappy(int n) {
        int sum = getSquareSum(n);

        if (sum == 1) {
            return true;
        } 
        if (sum == 4) { 
            return false;   // prevents infinite recursion
        }

        return isHappy(sum);
    }

    private int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

class Solution {
    public boolean checkDivisibility(int n) {
        int q = n;
        int sum = 0;
        int prod = 1;

        while (q != 0) {
            int rem = q % 10;
            sum += rem;
            prod *= rem;
            q /= 10;
        }

        return n % (sum + prod) == 0;
    }
}
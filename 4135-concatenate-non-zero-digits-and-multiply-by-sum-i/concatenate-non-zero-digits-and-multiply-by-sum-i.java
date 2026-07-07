class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int rem = n % 10;
            if (rem != 0) {
                sb.append(rem);
            }
            n /= 10;
        }

        sb.reverse();

        if (sb.length() == 0) {
            return 0;
        }

        long x = Long.parseLong(sb.toString());

        int sum = 0;
        long temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return x * sum;
    }
}
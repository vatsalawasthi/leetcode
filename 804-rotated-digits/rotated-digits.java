class Solution {
    public int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isGood(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isGood(int num) {
        int q = num;
        boolean changed = false;

        while (q != 0) {
            int digit = q % 10;

            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }

            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                changed = true;
            }

            q = q / 10;
        }

        return changed;
    }
}
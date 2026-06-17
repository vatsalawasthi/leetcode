class Solution {
    public char processStr(String s, long k) {
        int n = s.length();

        long[] len = new long[n + 1];
        long LIMIT = (long)1e18;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            long cur = len[i];

            if (ch >= 'a' && ch <= 'z') {
                len[i + 1] = Math.min(LIMIT, cur + 1);
            } else if (ch == '*') {
                len[i + 1] = Math.max(0, cur - 1);
            } else if (ch == '#') {
                len[i + 1] = Math.min(LIMIT, cur * 2);
            } else {
                len[i + 1] = cur;
            }
        }

        if (k >= len[n]) {
            return '.';
        }

        long idx = k;

        for (int i = n - 1; i >= 0; i--) {
            char op = s.charAt(i);

            long before = len[i];
            long after = len[i + 1];

            if (op >= 'a' && op <= 'z') {
                if (idx == after - 1) {
                    return op;
                }
            }
            else if (op == '#') {
                idx %= before;
            }
            else if (op == '%') {
                idx = after - 1 - idx;
            }
        }
        return '.';
    }
}
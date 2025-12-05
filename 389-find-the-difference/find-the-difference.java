class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        int m = t.length();

        // Convert to char arrays and sort them
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        // Compare sorted characters
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                i++;
                j++;
            } else {
                return b[j];
            }
        }

        return b[m - 1];
    }
}

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int maxH = 0;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                maxH = Math.max(maxH, h);
            }
        }
        return maxH;
    }
}
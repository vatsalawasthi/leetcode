class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        for(int i = 0; i<n; i++){
            int a = n-i;
            if (citations[i] >= a) {
                h = a;
                break;
            }
        }
        return h;
    }
}
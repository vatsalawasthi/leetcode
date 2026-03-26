class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] startArray = new int[n][2];

        for(int i = 0; i<intervals.length; i++){
            startArray[i][0] = intervals[i][0];
            startArray[i][1] = i;
        }
        Arrays.sort(startArray, (a, b) -> a[0] - b[0]);

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {

            int end = intervals[i][1];

            int left = 0;
            int right = n - 1;
            int ans = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (startArray[mid][0] >= end) {
                    ans = startArray[mid][1];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            result[i] = ans;
        }

        return result;
    }
}
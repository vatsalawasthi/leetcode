class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);

        int n = timePoints.size();
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            int curr = toMinutes(timePoints.get(i));
            int prev = toMinutes(timePoints.get(i - 1));

            ans = Math.min(ans, curr - prev);
        }

        int first = toMinutes(timePoints.get(0));
        int last = toMinutes(timePoints.get(n - 1));

        ans = Math.min(ans, 1440 - last + first);

        return ans;
    }

    private int toMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int mins = Integer.parseInt(time.substring(3, 5));

        return hours * 60 + mins;
    }
}
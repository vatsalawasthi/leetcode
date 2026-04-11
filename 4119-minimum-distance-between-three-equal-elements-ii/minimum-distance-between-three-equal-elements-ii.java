class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (!map.containsKey(val)) {
                map.put(val, new int[]{-1, -1});
            }

            int[] arr = map.get(val);

            // if we already have 2 occurrences
            if (arr[0] != -1) {
                minDist = Math.min(minDist, 2 * (i - arr[0]));
            }

            arr[0] = arr[1];
            arr[1] = i;
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
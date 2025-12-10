class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int count = 0, maxcount = 0, x = 0;

        List<int[]> freqList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                freqList.add(new int[]{nums[i - 1], count + 1});
                maxcount = Math.max(count + 1, maxcount);
                count = 0;
            }
        }

        freqList.add(new int[]{nums[n - 1], count + 1});
        maxcount = Math.max(maxcount, count + 1);

        List<Integer> list = new ArrayList<>();
        while (k != 0 && maxcount > 0) {
            for (int[] p : freqList) {
                if (p[1] == maxcount) {
                    list.add(p[0]);
                    k--;
                    if (k == 0) break;
                }
            }
            maxcount--;
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);  
        }

        return ans;
    }
}

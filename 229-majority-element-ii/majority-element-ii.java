class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int n = nums.length - 1;
        int a = (n + 1) / 3;

        for (int i = 0; i <= n; i++) {

            int num = nums[i];
            int count = 1;

            for (int j = i + 1; j <= n; j++) {
                if (nums[j] == num) {
                    count++;
                }
            }

            if (count > a && !list.contains(num)) {
                list.add(num);
            }
        }

        return list;
    }
}

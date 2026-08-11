class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        Arrays.sort(nums);

        // Find smallest missing integer >= sum
        for (int num : nums) {
            if (num < sum) {
                continue;
            }

            if (num == sum) {
                sum++;
            } else {
                break;
            }
        }
        return sum;
    }
}
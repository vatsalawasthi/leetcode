import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> firstIndex = new HashMap<>();

        int degree = 0;
        int minLength = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // Store first occurrence
            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }

            // Count frequency
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            // Current frequency
            int currentFreq = freq.get(num);

            // Update answer
            if (currentFreq > degree) {

                degree = currentFreq;

                minLength = i - firstIndex.get(num) + 1;

            } else if (currentFreq == degree) {

                minLength = Math.min(minLength,
                        i - firstIndex.get(num) + 1);
            }
        }
        return minLength;
    }
}
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();

        // Finding the maximum candies among all kids
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        // Checking for each kid if they can have the greatest number after adding extraCandies
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}

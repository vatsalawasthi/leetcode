import java.util.Arrays;

class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);

        int total = 0;
        int groupSize = 0;
        int count = 0;

        for (int x : answers) {

            // Start a new color group
            if (count == 0) {
                groupSize = x + 1;
                total += groupSize;
                count = 1;
            }
            // Current rabbit can fit in the existing group
            else if (x == groupSize - 1 && count < groupSize) {
                count++;
            }
            // Different answer OR current group is full
            else {
                groupSize = x + 1;
                total += groupSize;
                count = 1;
            }
        }

        return total;
    }
}
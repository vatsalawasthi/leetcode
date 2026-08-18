class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int[] count = {a, b, c};
        char[] chars = {'a', 'b', 'c'};

        StringBuilder ans = new StringBuilder();

        while (true) {
            int first = -1;
            int second = -1;

            // Find the character with the highest count
            for (int i = 0; i < 3; i++) {
                if (count[i] <= 0) continue;

                if (first == -1 || count[i] > count[first]) {
                    second = first;
                    first = i;
                } else if (second == -1 || count[i] > count[second]) {
                    second = i;
                }
            }

            if (first == -1) break;

            // Can't use first character because it would create xxx
            int len = ans.length();

            if (len >= 2 &&
                ans.charAt(len - 1) == chars[first] &&
                ans.charAt(len - 2) == chars[first]) {

                if (second == -1) break;

                ans.append(chars[second]);
                count[second]--;
            } else {
                ans.append(chars[first]);
                count[first]--;
            }
        }

        return ans.toString();
    }
}
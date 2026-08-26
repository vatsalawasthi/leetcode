class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        int left = 0;
        int countOnes = 0;

        int shortestLen = Integer.MAX_VALUE;
        String answer = "";

        for (int right = 0; right < n; right++) {

            if (s.charAt(right) == '1') {
                countOnes++;
            }
            while (countOnes == k) {

                int currentLen = right - left + 1;
                String current = s.substring(left, right + 1);
                if (currentLen < shortestLen ||
                    (currentLen == shortestLen && current.compareTo(answer) < 0)) {

                    shortestLen = currentLen;
                    answer = current;
                }
                if (s.charAt(left) == '1') {
                    countOnes--;
                }
                left++;
            }
        }
        return answer;
    }
}
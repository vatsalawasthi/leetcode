class Solution {
    public String removeDuplicateLetters(String s) {

        int[] last = new int[256];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i)] = i;
        }

        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (seen[c]) continue;

            while (result.length() > 0 &&
                    result.charAt(result.length() - 1) > c &&
                    last[result.charAt(result.length() - 1)] > i) {

                seen[result.charAt(result.length() - 1)] = false;
                result.deleteCharAt(result.length() - 1);
            }

            result.append(c);
            seen[c] = true;
        }

        return result.toString();
    }
}
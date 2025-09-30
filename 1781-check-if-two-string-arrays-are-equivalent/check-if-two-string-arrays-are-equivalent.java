class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i = 0, j = 0;   // index of arrays
        int p = 0, q = 0;   // index within strings

        while (i < word1.length && j < word2.length) {
            if (word1[i].charAt(p) != word2[j].charAt(q)) {
                return false;
            }

            // move forward in both
            p++;
            q++;

            // if p reaches end of word1[i], move to next string
            if (p == word1[i].length()) {
                p = 0;
                i++;
            }
            // if q reaches end of word2[j], move to next string
            if (q == word2[j].length()) {
                q = 0;
                j++;
            }
        }

        // both must finish exactly at the same time
        return i == word1.length && j == word2.length;
    }
}

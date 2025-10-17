class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;  // if any letter not found, it's not a pangram
            }
        }
        return true;  // all letters found
    }
}

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        int[] target = new int[26];

        // Count characters from licensePlate
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                target[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String ans = "";

        for (String word : words) {

            int[] freq = new int[26];

            // Count characters in current word
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean valid = true;

            // Check if word satisfies required counts
            for (int i = 0; i < 26; i++) {
                if (freq[i] < target[i]) {
                    valid = false;
                    break;
                }
            }

            // Update answer
            if (valid) {
                if (ans.equals("") || word.length() < ans.length()) {
                    ans = word;
                }
            }
        }
        return ans;
    }
}
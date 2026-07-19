class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        List<Character> list = new ArrayList<>();

        for(char c : s.toCharArray()){
            freq[c-'a']--;

            if (list.contains(c)) {
                continue;
            }
            while (!list.isEmpty()
                    && list.get(list.size() - 1) > c
                    && freq[list.get(list.size() - 1) - 'a'] > 0) {

                list.remove(list.size() - 1);
            }
            list.add(c);
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : list) {
            ans.append(ch);
        }
        return ans.toString();
    }
}
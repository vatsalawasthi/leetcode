class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] arr = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", arr, ans);

        return ans;
    }

    public void backtrack(String digits, int index,
                          String current, String[] arr,
                          List<String> ans) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';

        String letters = arr[digit];

        for (int i = 0; i < letters.length(); i++) {

            backtrack(digits, index + 1,
                      current + letters.charAt(i),
                      arr, ans);
        }
    }
}
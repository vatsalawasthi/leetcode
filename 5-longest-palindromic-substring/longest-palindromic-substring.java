class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;

        String result = "";
        for(int i = 0; i<n; i++){
            String p1 = expand(s,i,i);
            String p2 = expand(s,i,i+1);

            if (p1.length() > result.length()) result = p1;
            if (p2.length() > result.length()) result = p2;
        }
        return result;
    }
    private String expand(String s, int left, int right){
        int n = s.length();
        while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
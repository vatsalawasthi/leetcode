class Solution {
    public String toLowerCase(String s) {
          String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }

            result = result + c;
        }

        return result;
    }
}
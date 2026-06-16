class Solution {
    public String processStr(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                stack.push(ch);
            }

            else if (ch == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else if (ch == '#') {
                List<Character> temp = new ArrayList<>(stack);

                for (char c : temp) {
                    stack.push(c);
                }
            }

            else if (ch == '%') {
                Collections.reverse(stack);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }
}
class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1; // stack is empty

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                // closing bracket: check if stack empty
                if (top == -1) return false;

                char open = stack[top--]; // pop
                if (c == ')' && open != '(') return false;
                if (c == '}' && open != '{') return false;
                if (c == ']' && open != '[') return false;
            }
        }

        // if stack empty at end → valid
        return top == -1;
    }
}

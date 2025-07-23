class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // Initialize an empty stack to store opening brackets

        for (char c : s.toCharArray()) { // Iterate through each character in the input string
            if (c == '(' || c == '{' || c == '[') {
                // If the character is an opening bracket, push it onto the stack
                stack.push(c);
            } else {
                // If the character is a closing bracket
                if (stack.isEmpty()) {
                    // If the stack is empty, it means there's no corresponding opening bracket
                    return false;
                }

                char top = stack.pop(); // Pop the top element (last encountered opening bracket)

                // Check if the popped opening bracket matches the current closing bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatch found
                }
            }
        }

        // After iterating through the entire string, if the stack is empty,
        // it means all opening brackets have been correctly closed.
        return stack.isEmpty();
    }

    
}
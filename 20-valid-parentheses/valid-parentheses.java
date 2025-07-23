class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        if(s.length() == 1) return false;
        for(char c : s.toCharArray()){
            if(c == '(' || c =='{' || c == '['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                    
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatch found
                }
            }
        }
        return stack.isEmpty();

    }
}
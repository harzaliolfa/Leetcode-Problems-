class Solution {
    public boolean isValid(String s) {
        Map<Character, Integer> openPar = Map.of('(',1,'{',2,'[',3);
        Map<Character, Integer> closePar = Map.of(')',1,'}',2,']',3);
        Stack<Character> stack = new Stack<Character>();
        if(s.length() == 1) return false;
        for(int i =0; i< s.length(); i++){
            Character  c = s.charAt(i);
            if(openPar.containsKey(c)){
                stack.push(c);
            }
            else {
                if(stack.isEmpty() && closePar.containsKey(c)) return false;
                if(!stack.isEmpty()){
                    
                    if(openPar.get(stack.peek()) == closePar.get(c)){
                        stack.pop();
                    }
                    else {
                        stack.push(c);
                    }
                }
            }
        }
        return stack.isEmpty();

    }
}
class Solution {
    public boolean isValid(String s) {
Map<String, Integer> openPar = Map.of("(",1,"{",2,"[",3);
        Map<String, Integer> closePar = Map.of(")",1,"}",2,"]",3);
        Stack<String> stack = new Stack<String>();
        if(s.length() == 1) return false;
        for(int i =0; i< s.length(); i++){
            String  c = String.valueOf(s.charAt(i));
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
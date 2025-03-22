class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String first_word = strs[0];
        StringBuilder prefix = new StringBuilder();
       String last_word = strs[strs.length - 1];
       for(int i =0; i< strs[0].length(); i++){
            if(first_word.charAt(i) == (last_word.charAt(i)))
            { prefix.append(first_word.charAt(i));}
            else{
                return prefix.toString();
            }
       }
        return prefix.toString();
    }
}

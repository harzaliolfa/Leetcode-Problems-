class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}

        Map<Character, Integer> s_map = new HashMap<>();
        for(char c : s.toCharArray()){
            s_map.merge(c, 1, Integer::sum);
        }
        Map<Character, Integer> t_map = new HashMap<>();
        for(char c : t.toCharArray()){
            t_map.merge(c, 1, Integer::sum);
    
        }

        for(Map.Entry<Character,Integer> entry: s_map.entrySet()){
            if ( !t_map.containsKey(entry.getKey()) || !t_map.get(entry.getKey()).equals(entry.getValue())){
                return false;
           }
        }
        return true ;
    }
}
class Solution {
        
public int lengthOfLongestSubstring(String s) {

        Map<String, Integer> map = new HashMap<>();
        if(s.length() == 0) return 0;
        else if(s.length() == 1) return 1;

        

        for(int i = 0; i< s.length(); i ++){
            String mainChar = String.valueOf(s.charAt(i));
            Set<String> set = new HashSet<>();
            String substring = mainChar ;
            set.add(mainChar);
            for(int j = i +1 ; j< s.length(); j ++){
                String sdChar = String.valueOf(s.charAt(j));
                if(!set.contains(sdChar)){
                    substring = substring + sdChar;
                    set.add(sdChar);}
                else break;
            }

            if(!map.containsValue(substring.length())){
                map.put(substring, substring.length());
            }
        }
        return Collections.max(map.values());

    }
}
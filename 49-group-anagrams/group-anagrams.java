class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i< strs.length ; i++){

            char [] sortedWord = strs[i].toCharArray();
            Arrays.sort(sortedWord);
            map.computeIfAbsent(Arrays.toString(sortedWord), k -> new ArrayList<>()).add(strs[i]);

            }
            return new ArrayList<>(map.values());
        }

    }

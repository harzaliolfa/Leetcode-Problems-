class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set <Integer> set = new HashSet<>() ;   
            for (int v : arr) {
            map.merge(v, 1, Integer::sum);
            }

        for(Integer v : map.values()){
            if(! set.add(v)){
                return false;
            }
        }
            return true;

}
}
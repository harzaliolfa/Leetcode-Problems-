class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int key : nums){
          map.put(key,  map.getOrDefault(key, 0)+1) ;
        }
        for(Map.Entry<Integer,Integer> element : map.entrySet() ){
            Integer key = element.getKey();
            Integer value = element.getValue();
            if( value > n){ result = key;}

        }
        return result;
    }
}

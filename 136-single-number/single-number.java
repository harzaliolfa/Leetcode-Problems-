class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(nums.length == 1){return nums[0];}
        for(int key: nums){
            map.put(key, map.getOrDefault(key , 0) +1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        
            if (entry.getValue() == 1){ return  entry.getKey();} 

        }
        return -1;
    }
}
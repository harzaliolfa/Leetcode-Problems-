class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);

        for(int i = 0; i< nums.length -2; i ++){
            int right = nums.length -1;
            int left = i + 1;
            if( i> 0 && nums[i] == nums[i-1]) continue;

            while ( left < right ){
                int sum = nums[i] + nums[right] + nums[left];
                if(sum == 0){
                    result.add(new ArrayList<>(Arrays.asList(nums[i] , nums[left], nums[right])));
                    while(left < right && nums[left] == nums[left+1]) left ++;
                    while(left < right && nums[right] == nums[right-1]) right --;

                    left ++;
                    right --;


                }
                else if(sum< 0){
                    left++;
                }
                else  {
                    right --;
                    
                }
            }
        }

        return result;
    }
}
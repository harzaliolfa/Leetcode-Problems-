class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length -1 ;
        if(nums[start] == target ){return start;}
        if(nums[end] == target ){return end;}

        while(start <= end){
            int mid = (start + end) /2;
            if(nums[mid] == target){return mid;}
            if(nums[mid] >= target){
                end = mid -1;
            }
            else{ start = mid +1; }
        }
    
    return -1;    
    }
}
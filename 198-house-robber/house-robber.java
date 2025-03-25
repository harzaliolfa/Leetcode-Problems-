class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] mv = new int [n];
        if(n==1){return nums[0];}

        mv[0] = nums[0];
        mv[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i<n; i++){
            mv[i] = Math.max(mv[i-1], nums[i] + mv[i-2]);
        }
        return mv[n-1];
    }
}
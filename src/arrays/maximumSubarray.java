class Solution {
    public int maxSubArray(int[] nums) {
        int cur = 0;
        int max = nums[0];

        for(int i =0; i<nums.length; i++){
            if(cur <0){
                cur = 0;
            }
            cur+=nums[i];
            max = Math.max(cur, max);
        }
        return max;
    }
}
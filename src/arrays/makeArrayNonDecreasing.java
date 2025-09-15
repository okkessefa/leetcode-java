class Solution {
    public int maximumPossibleSize(int[] nums) {
        int length = 0; 
        int top = nums[0];

        for(int n : nums){
            if(top <= n){
                length++;
                top = n;
            }
        }
        return length;
    }
}
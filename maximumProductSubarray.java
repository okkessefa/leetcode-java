class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];

        for(int i =1; i<n; i++){
            int val = nums[i];
            if(val<0){
                int temp = max;
                max = min;
                min = temp;
            }
            min = Math.min(val, min*val);
            max = Math.max(val, max*val);
            result = Math.max(result, max);
        }
        return result;
    }
}
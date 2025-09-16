class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        
        int prefix = 1;
        for(int i = 0; i<n; i++){
            a[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int j = n-1; j>=0 ;j--){
            a[j] *= suffix;
            suffix *= nums[j];
        }
        return a;
    }
}
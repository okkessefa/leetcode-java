class Solution 
{
    public int triangleNumber(int[] nums) 
    {
        // we can say arrays have at least 3 values if wants to crate valid triangle
        int n = nums.length;
        if(n < 3) return 0;
        Arrays.sort(nums);
        int count = 0;

        for(int k = n-1; k>=2; k--){
            int i =0;
            int j = k-1;

            while(i<j){
                if(nums[i]+nums[j] > nums[k]){
                    count += j-i;
                    j--;
                }else {
                    i++;
                }
            }
        }

        return count;
    }
}
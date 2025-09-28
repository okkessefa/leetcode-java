import java.util.*;
class Solution 
{
    public int largestPerimeter(int[] nums) 
    {
        int n = nums.length;
        if(n < 3) return 0;
        int maxPerimeter = 0;

        Arrays.sort(nums);
        for(int i =2; i< n ; i++)
        {
            if(nums[i-2]+nums[i-1] > nums[i])
            {
                int newPerimeter = (nums[i]+nums[i-1] + nums[i-2]);
                maxPerimeter = Math.max(maxPerimeter, newPerimeter);
            }
        }

        return maxPerimeter;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // be ensure that nums1 is smallest one
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int hight= m;
        
        while(low <= hight)
        {
            int i = (low + hight) /2;
            int j = (m+n+1) /2 -i;
            // using ternary opeartor
            int leftA = (i==0) ? Integer.MIN_VALUE : nums1[i-1];
            int rightA = (i==m) ? Integer.MAX_VALUE : nums1[i];
            
            int leftB = (j==0) ? Integer.MIN_VALUE : nums2[j-1];
            int rightB = (j==n) ? Integer.MAX_VALUE : nums2[j];
            
            if(leftA <= rightB && leftB <= rightA)
            {
                if((m+n) % 2 == 0)
                {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                }
                else
                {
                    return Math.max(leftA, leftB);
                }
            }
            else if(leftA > rightB)
            {
                hight = i -1;
            }
            else
            {
                low = i +1;
            }
        }
        throw new IllegalArgumentException("Input arrays not sorted");          
    }
}
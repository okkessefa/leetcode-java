class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // ✅ Ensure nums1 is the smaller array to keep binary search efficient
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        // 🔁 Perform binary search on the smaller array (nums1)
        while (low <= high) {
            // Partition index in nums1
            int i = (low + high) / 2;
            // Partition index in nums2 (so total left elements = total right elements)
            int j = (m + n + 1) / 2 - i;

            // 🧩 Handle edges by assigning ±infinity values
            int leftA  = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];  // max of left part of nums1
            int rightA = (i == m) ? Integer.MAX_VALUE : nums1[i];      // min of right part of nums1
            int leftB  = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];  // max of left part of nums2
            int rightB = (j == n) ? Integer.MAX_VALUE : nums2[j];      // min of right part of nums2

            // ✅ Found correct partition
            if (leftA <= rightB && leftB <= rightA) {
                // If total length is even → average of two middle values
                if ((m + n) % 2 == 0)
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                // If odd → median is the max of left side
                else
                    return Math.max(leftA, leftB);
            }
            // ⬅️ Too many elements from nums1 on the left side — move left
            else if (leftA > rightB) {
                high = i - 1;
            }
            // ➡️ Too few elements from nums1 on the left side — move right
            else {
                low = i + 1;
            }
        }

        // 🚫 This line should theoretically never be reached if arrays are sorted
        throw new IllegalArgumentException("Input arrays not sorted");
    }
}

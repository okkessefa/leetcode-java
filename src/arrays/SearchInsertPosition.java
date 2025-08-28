class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length;          // search in [lo, hi)
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;      // avoids overflow
            if (nums[mid] < target) {
                lo = mid + 1;                  // target is in (mid, hi)
            } else {
                hi = mid;                      // target is in [lo, mid]
            }
        }
        return lo;                              // first index with nums[i] >= target
    }
}

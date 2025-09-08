import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (window.contains(nums[r])) return true;
            window.add(nums[r]);
            if (r - l >= k) { // keep size ≤ k
                window.remove(nums[l]);
                l++;
            }
        }
        return false;
    }
}
import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        int prev = Integer.MIN_VALUE;
        for(int num : nums){
            //after operation procued number must be in [Value_Minimum-k, Value_maximum+k]
            int current = Math.min(Math.max(num-k, prev+1), num+k);
            if(current>prev){
                cnt++;
                prev = current;
            }
        }
        return cnt;
    }
}
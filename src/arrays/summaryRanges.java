import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int n = nums.length;
        if(n == 0) return res;

        int start = nums[0];

        for(int i = 1; i<=n; i++){

            if(i==n || (long) nums[i] - (long) nums[i-1] != 1L){
                int end = nums[i -1];
                if(start == end){
                    res.add(Integer.toString(start));
                }else{
                    res.add(start+ "->" + end);
                }
                if(i < n) start = nums[i];
            }
        }
        return res;
    }
}
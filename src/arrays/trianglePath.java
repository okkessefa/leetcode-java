import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = triangle.getFirst().getFirst();

        for (int i = 1; i < n; i++) {
            List<Integer> row = triangle.get(i);
            for (int j = i; j >= 0; j--) {
                int val = row.get(j);
                int bestFromAbove =
                        (j == 0)   ? dp[j] :
                                (j == i)   ? dp[j - 1] :
                                        Math.min(dp[j], dp[j - 1]);
                dp[j] = bestFromAbove + val;
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) ans = Math.min(ans, dp[j]);
        return ans;
    }
}
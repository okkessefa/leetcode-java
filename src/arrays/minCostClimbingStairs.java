class Solution {
    public int minCostClimbingStairs(int[] cost) {
        /*
        to reach some staircase n
        option 1:
        go there from staircase n - 1
        (the min cost to reach staircase n - 1) + (cost[n-1])

        option 2:
        go there from staircase n - 2
        (the min cost to reach staircase n - 2) + (cost[n-2])

        base cases:
        index 0
        index 1
        both indices 0,1 have a total cost 0
        0,1,2,3,4,5 ... n
        */
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i<=n; i++){
            int option1 = dp[i-1] + cost[i-1];
            int option2 = dp[i-2] + cost[i-2];
            dp[i] = Math.min(option1, option2);
        }
        return dp[n];
    }
}
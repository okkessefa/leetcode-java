class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int MOD = 1_000_000_007;
        long[] dp = new long[n + 1]; // dp[day] = new learners on 'day'
        dp[1] = 1;                   // Day 1: one person learns

        long share = 0;              // number of active sharers today

        // We compute from day 2 to n; day 1 is initialized.
        for (int day = 2; day <= n; day++) {
            // Cohorts that START sharing today:
            int start = day - delay;
            if (start >= 1) {
                share = (share + dp[start]) % MOD;
            }

            // Cohorts that FORGET today (cannot share on forgetting day):
            int stop = day - forget;
            if (stop >= 1) {
                share = (share - dp[stop]) % MOD;
                if (share < 0) share += MOD;
            }

            // New learners today are exactly the active sharers:
            dp[day] = share;
        }

        // People who still remember on day n:
        long ans = 0;
        int from = Math.max(1, n - forget + 1);
        for (int day = from; day <= n; day++) {
            ans = (ans + dp[day]) % MOD;
        }

        return (int) ans;
    }
}

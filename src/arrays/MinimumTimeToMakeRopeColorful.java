class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int total = 0;
        int runMax = neededTime[0];

        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                total += Math.min(neededTime[i], runMax);
                runMax = Math.max(runMax, neededTime[i]);  
            } else {
                runMax = neededTime[i];                    
            }
        }
        return total;
    }
}
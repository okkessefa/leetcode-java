class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;  
        int maxProfit = 0;                 

        for (int p : prices) {
            if (p - minSoFar > maxProfit) {
                maxProfit = p - minSoFar;
            }
            if (p < minSoFar) {
                minSoFar = p;
            }
        }
        return maxProfit;
    }
}
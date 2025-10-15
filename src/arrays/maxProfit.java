class Solution {
    public int maxProfit(int[] prices) {
         
        int maxProfit = 0;
        int current = 0;

        while (current + 1 < prices.length) {
            while (current + 1 < prices.length && prices[current] >= prices[current + 1]) {
                current++;
            }
            int buyIdx = current;

            while (current + 1 < prices.length && prices[current] <= prices[current + 1]) {
                current++;
            }
            int sellIdx = current;

            if (sellIdx > buyIdx) {
                maxProfit += prices[sellIdx] - prices[buyIdx];
            }
        }
        return maxProfit;
    }
}
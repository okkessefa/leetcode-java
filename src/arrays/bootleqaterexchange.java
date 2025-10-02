class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            empty -= numExchange;  // spend numExchange empties
            ans++;                 // drink the new full bottle
            empty++;               // it becomes an empty
            numExchange++;         // next exchange is harder
        }

        return ans;
    }
}
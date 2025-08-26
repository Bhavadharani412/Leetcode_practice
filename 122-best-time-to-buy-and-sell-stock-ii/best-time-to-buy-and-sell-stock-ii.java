class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = prices[0];
        for(int i = 0; i < prices.length; i++){
            if(start < prices[i])
            profit += prices[i] - start;
            start = prices[i];
        }
        return profit;
    }
}

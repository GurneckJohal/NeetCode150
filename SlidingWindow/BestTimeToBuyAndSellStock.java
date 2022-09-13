class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int buy = 0;
        
        int profit = 0;
        for(int sell = 1; sell < prices.length;sell++){
            if(prices[buy] > prices[sell] && sell+1 < prices.length){
                buy=sell;
            }
            else{
                if(prices[sell] - prices[buy] > profit){
                    profit = prices[sell] - prices[buy];
                }
            }
        }
        return profit;
    }
}

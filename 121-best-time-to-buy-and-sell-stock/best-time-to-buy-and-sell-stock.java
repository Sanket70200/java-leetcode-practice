class Solution {
    public int maxProfit(int[] prices) {
    int buy_profit=prices[0];
    int profit=0;

    for(int i=0;i<prices.length;i++){
        if(prices[i]<buy_profit){
            buy_profit=prices[i];
        }else{
            int currentprofit=prices[i]- buy_profit;
            profit=Math.max(currentprofit,profit);
        }
    }

    return profit;
    }

}
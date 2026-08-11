class Solution {
    public int maxProfit(int[] prices) {
    int buy_prices=prices[0];
    int price=0;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<buy_prices){
            buy_prices=prices[i];

        }else{
            int current_prices=prices[i]-buy_prices;

            price=Math.max(current_prices,price);

        }
    }

    return price;
    }

}
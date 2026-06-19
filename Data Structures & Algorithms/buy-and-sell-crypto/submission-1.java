class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;
        for(int i = 0; i < n; i++){
            if(prices[i] >  buyPrice){
            int sellPrice = prices[i] - buyPrice;
            maxProfit = Math.max(sellPrice, maxProfit);
            }else{
                buyPrice = prices[i];
            }

            
        }
        return maxProfit;
    }
}

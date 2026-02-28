class StockDP2 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ahead[] = new int[2];
        int curr[] = new int[2];
        ahead[0] = ahead[1] = 0;
        for(int i = n-1 ; i>=0 ; i--){
            int maxProfit = 0;
            for(int buy = 0 ; buy<=1 ; buy++){
                if(buy == 1)
                maxProfit = Math.max(-prices[i] + ahead[0] , 0 + ahead[1]);
                else
                maxProfit = Math.max(prices[i] + ahead[1] , 0 + ahead[0]);
                curr[buy] = maxProfit;
            }
            ahead = curr.clone();
        }
        return curr[1];
    }
}
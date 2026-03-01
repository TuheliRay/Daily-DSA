class StockDP3{
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ahead[][] = new int[2][3];
        int current[][] = new int[2][3];
        for(int ind = n-1 ; ind>=0 ; ind--){
            for(int buy = 0 ; buy<2 ; buy++){
                for(int trans = 1 ; trans<=2 ; trans++){
                    int profit = 0;
                    int yesBuy = 0 , noBuy = 0;
                    int yesSell = 0 , noSell = 0;
                    if(buy == 1){
                        yesBuy = -prices[ind] + ahead[0][trans];
                        noBuy = ahead[1][trans];
                        profit = Math.max(yesBuy , noBuy);
                    }
                    else{
                        yesSell = prices[ind] + ahead[1][trans-1];
                        noSell = ahead[0][trans];
                        profit = Math.max(yesSell , noSell);
                    }
                    current[buy][trans] = profit;
                }
            }
            for (int i = 0; i < 2; i++) {
                System.arraycopy(current[i], 0, ahead[i], 0, 3);
            }
        }
        return current[1][2];
    }
}
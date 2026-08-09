class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i= 0; i < prices.length-1; i++){
            for(int j=i+1; j < prices.length; j++){
                int sell = prices[j] - prices[i];
                if(sell > profit) profit = sell;
            }
        }

        return profit;
    }

    public int maxProfit2(int[] prices) {
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            int profit = prices[i] - min_price;
            if(profit > max_profit){
                max_profit = profit;
            }
        }
        return max_profit;
    }

    
    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        int[] prices = {7,1,5,3,6,4};
        int profit = mp.maxProfit2(prices);
        System.out.println("Maximum profit: " + profit);
    }
}
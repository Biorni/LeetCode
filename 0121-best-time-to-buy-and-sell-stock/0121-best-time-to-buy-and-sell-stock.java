class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int profit = 0;
        int maxProfit = 0;
        

        for (int i = 1; i<prices.length; i++){
            profit = prices[i] - min;

            if(profit>maxProfit)
                maxProfit=profit;

            if(prices[i]<min)
               min = prices[i];     
        }

        return maxProfit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        // int profit = 0;
        // for(int i=0; i<prices.length; i++){
        //     int ref = prices[i];
        //     for(int j=i; j<prices.length;j++){
        //         int sub = prices[j]-ref;
        //         profit = (profit < sub) ? sub : profit;
        //     }
        // }
        // return profit;

        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i< prices.length;i++){
            minProfit = Math.min(minProfit,prices[i]);
            int currentProfit =prices[i]-minProfit;
            maxProfit = Math.max(currentProfit,maxProfit);
        }

        return maxProfit;
        
    }
}
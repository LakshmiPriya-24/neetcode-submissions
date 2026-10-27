class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l = 0;
        int r = 1;
        int maxp = 0;
        while(r < n){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxp = Math.max(maxp,profit);
            }else{
                l = r;
            }
            r++;
        }
    return maxp; 
    }
}

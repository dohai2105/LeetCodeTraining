public class No121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
            else if (currentPrice - minPrice > maxProfit) {
                maxProfit = currentPrice - minPrice;
            }
        }
        return maxProfit;
    }
}


public class Stocks {
    public static int BuyandSellStocks(int prices[]) {                             // Time Complixity = O(n)
        int MaxProfit = 0;
        int BuyPrices = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) {
            if (BuyPrices<prices[i]) {
                int profit = prices[i] - BuyPrices;
                MaxProfit = Math.max(MaxProfit, profit);
            }else{
                BuyPrices = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyandSellStocks(prices));
    }
}

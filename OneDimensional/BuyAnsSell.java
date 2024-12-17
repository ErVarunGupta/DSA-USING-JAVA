package OneDimensional;

public class BuyAnsSell {
    public static int buyAndSell(int prices[]){
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < n; i++){
//            if(buyPrice > prices[i]){
//                buyPrice = prices[i];
//            }
            // minimum buyPrice
            buyPrice = Math.min(buyPrice, prices[i]);

            //today selling price
            int sellPrice = prices[i];

            // today profit
            int currProfit = sellPrice - buyPrice;
            //maximum profit
            maxProfit = Math.max(currProfit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {1,2};
        System.out.println(buyAndSell(prices));
    }
}

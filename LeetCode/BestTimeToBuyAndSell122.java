package LeetCode;

public class BestTimeToBuyAndSell122 {
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int maxProfit = 0;
        int buyPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < prices[i-1]){
                maxProfit  += prices[i-1] - buyPrice;
                buyPrice = prices[i];
            }
        }
        maxProfit += prices[prices.length-1] - buyPrice;
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}

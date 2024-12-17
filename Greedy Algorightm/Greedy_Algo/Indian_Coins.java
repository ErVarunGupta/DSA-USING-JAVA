package Greedy_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_Coins {
    public static int minChange(Integer[] coins, int amount){
        //Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i++){
            if(amount > coins[i]){
                while (amount >= coins[i]){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println(ans);
        return countOfCoins;

        //2nd approach
//        int minNotes = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = currency.length-1; i >= 0; i--){
//            if(amounnt >= currency[i]){
//                while(amounnt >= currency[i]){
//                    minNotes++;
//                    list.add(currency[i]);
//                    amounnt -= currency[i];
//                }
//            }
//        }
//        System.out.println(list);
//        return minNotes;
    }

    public static void main(String[] args) {
        //int currency[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        //System.out.println("min notes = "+minChange(currency,590));

        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int amount = 590;
        System.out.println("min count of coins = "+ minChange(coins,amount));
    }
}

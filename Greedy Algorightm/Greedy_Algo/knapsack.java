package Greedy_Algo;

import java.util.Arrays;
import java.util.Comparator;

public class knapsack {
    static int knapsack(int weight[], int value[], int W){
        int ratio[][] = new int[weight.length][2];
        for(int i =0; i < weight.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = weight[i]/value[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int maxWeight = 0;

        for(int i = ratio.length-1; i >= 0; i--){
            int indx = (int)ratio[i][0];
            if(W >= weight[indx]){
                maxWeight += value[indx];
                W -= weight[indx];
            }else{
                maxWeight += (ratio[i][1] * weight[indx]);
                W -= weight[indx];
            }
        }
        return maxWeight;
    }
    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int W = 50;

        System.out.println(knapsack(weight, value, W));
    }
}

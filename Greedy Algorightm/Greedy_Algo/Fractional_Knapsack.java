package Greedy_Algo;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static int kanpsack(int[] weight, int[] value, int capacity){
//        int[] ratio = new int[weight.length];
//        for(int i = 0; i < ratio.length; i++){
//            ratio[i] = value[i]/weight[i];
//        }
//
//        //sorting
//        int activites[][] = new int[ratio.length][4];
//        for(int i = 0; i < ratio.length; i++){
//            activites[i][0] = i;
//            activites[i][1] = ratio[i];
//            activites[i][2] = weight[i];
//            activites[i][3] = value[i];
//        }
//
//        Arrays.sort(activites, Comparator.comparingDouble(o -> o[1]));
//
//        for(int i = 0; i < ratio.length; i++){
//            for(int j = 0; j < 4; j++){
//                System.out.print(activites[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int maxWeight = 0;
//
//        for(int i = 0; i < ratio.length; i++){
//            if(capacity >= weight[i]){
//                maxWeight += value[i];
//                capacity -= weight[i];
//            }
//            else{
//                maxWeight = maxWeight + (ratio[i] * capacity);
//                break;
//            }
//        }

//        return maxWeight;


        double ratio[][] = new double[value.length][2];
        //0th col => indx , 1st col => ratio

        for(int i = 0; i < value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int maxWeight = 0;

        for(int i = ratio.length-1; i >= 0; i--){
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){  //include full item
                maxWeight += value[idx];
                capacity -= weight[idx];
            }else{                          //include fractional item
                maxWeight += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }
        return maxWeight;
    }

    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int W = 50;

        int ans = kanpsack(weight, value, W);
        System.out.println("max value = "+ans);
    }
}

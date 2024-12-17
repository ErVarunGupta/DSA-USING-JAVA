package Greedy_Algo;

import java.util.Arrays;
import java.util.Comparator;

public class Max_Len_Chain_Pairs {
    public static void main(String[] args) {   /// O(nlogn)
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLenght = 1;
        int chainEnd = pairs[0][1]; //Last selected pair end // chain end

        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > chainEnd){  //pairs[i][0] = starting point; chainEnd = end of previous pair
                chainLenght++;
                chainEnd = pairs[i][1];         //pairs[i][1] = end of current pair
            }
        }

        System.out.println("max length of chain = "+chainLenght);
    }
}

package Greedy_Algo;

import java.util.Arrays;
import java.util.Collections;

public class Chocola_Problem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};  //m-1
        Integer costHor[] = {4, 1, 2};  // n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int v  = 0; // iterator for costVer
        int h = 0;   // iterator for costHor
        int hp = 1;  // horizontal pieces
        int vp = 1;  // vertical pieces
        int cost = 0;

        while(v < costVer.length && h < costHor.length){
            if(costVer[v] <= costHor[h]){   //horizontal cut
                cost += (vp * costHor[h]);
                hp++;
                h++;
            }else{                          // vertical cut
                cost += (hp * costVer[v]);
                vp++;
                v++;
            }
        }

        while (v < costVer.length){
            cost += (hp * costVer[v]);
            vp++;
            v++;
        }

        while(h < costHor.length){
            cost += (vp * costHor[h]);
            hp++;
            h++;
        }

        System.out.println("min cost to cut chocolate = "+cost);
    }
}

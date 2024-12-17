package DivideAndConquer.Assingnment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
    public static int majority(int arr[]){
       Arrays.sort(arr);
       int n = arr.length;

       for(int i = 0; i < n; i++){
           if(arr[i] == arr[n/2+i]){
               return arr[i];

           }
       }
       return -1;
    }
}

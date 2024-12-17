package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int arr[]){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("max : "+max);

        int count[] = new int[max + 1];
        for(int i = 0; i < count.length; i++){
            count[i] = 0;
        }
        for(int j = 0; j < arr.length; j++){
            int element = arr[j];
            count[element]++;
        }
        int i = 0;

        //Ascending logic

//        for(int k = 0; k < count.length; k++){
//            while( 0 < count[k]){
//                arr[i] = k;
//                i++;
//                count[k]--;
//            }
//        }

        //Descending logic
        for(int k = count.length-1; k >= 0 ; k--){
            while( 0 < count[k]){
                arr[i] = k;
                i++;
                count[k]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6,4,0,1,2};
        System.out.println(Arrays.toString(countingSort(arr)));
    }
}

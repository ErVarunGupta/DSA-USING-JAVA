package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;

            //Ascending logic
//            while(prev >= 0 && curr < arr[prev]){
//                arr[prev + 1] = arr[prev];
//                prev--;
//            }

            //Descending logic
            while(prev >= 0 && curr > arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3, 8, 1, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

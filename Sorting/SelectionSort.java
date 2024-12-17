package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++ ){
                if(arr[min] > arr[j]){
                   min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void selectionSortDescendig(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int max = i;
            for(int j = i+1; j < arr.length; j++ ){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3, 2, 1, 0};
        selectionSortDescendig(arr);
        System.out.println(Arrays.toString(arr));
    }
}

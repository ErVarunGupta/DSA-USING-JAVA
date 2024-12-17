package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5};
        bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //printArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            boolean ascending = true;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    ascending = false;
                }
            }
            if(ascending == true){
                System.out.println("Given array is already sorted");
                return;
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            //fird minimun position in right unsorted array
            for(int j = i+1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]  = curr;
        }
    }

}

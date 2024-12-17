package DivideAndConquer;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 0, 1, 9,-4};
       quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[], int low, int high){
        if(low > high){
            return;
        }
        int s = low;
        int e = high;
        int mid = low + (high - low)/2;
        int pivot = arr[mid];
        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s+1,high);
    }
}

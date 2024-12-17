package Backtracking;

import static DivideAndConquer.MergeSort.print;

public class Array {
    public static void changeArray(int arr[], int i, int value){  // O(n) -> TC and SC
        //base case
        if(i == arr.length){
            print(arr);
            return;
        }
        //recursion
        arr[i] = value;
        changeArray(arr,i+1,value+1); // function call step
        arr[i]  = arr[i] - 2; // backtracking step
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr,0,1);
        print(arr);
    }
}

package LeetCode;

import java.util.Arrays;

public class SecondLargest {
    public static int secondLargest(int arr[]){
        if(arr.length <= 1){
            return -1;
        }
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            if(largest > arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    public static int secondLargest1(int arr[]){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int secondLargest = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if((secondLargest < arr[i]) && (secondLargest < largest)){
//                secondLargest = arr[i];
//            }
//        }

        int i = 1;

        while(secondLargest < arr[i] && secondLargest < largest){
            secondLargest = arr[i];
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int arr[] = {2, 6, 1,7, 8,9, 0, 6, 7};
        System.out.println(secondLargest1(arr));
    }

}

package LeetCode;


import java.util.Arrays;

public class LargestElement {
    public static int largest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 8, 0, 6, 7};
        System.out.println(largest(arr));
    }
}

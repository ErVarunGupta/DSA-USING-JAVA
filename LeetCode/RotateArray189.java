package LeetCode;

import java.util.Arrays;

public class RotateArray189 {
    public static void rotate(int[] nums, int k) {
//        for(int i = 0; i < k; i++){
//            int n = nums.length;
//            int temp = nums[n-1];
//            for(int j = nums.length-1; j > 0; j--){
//                nums[j] = nums[j-1];
//            }
//            nums[0] = temp;
//        }
        int n = nums.length;
        k %= n;
        //left rotation
//        reverse(nums, 0, n-1);
//        reverse(nums, 0, n-k-1);
//        reverse(nums, n-k, n-1);

        //right rotation
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}

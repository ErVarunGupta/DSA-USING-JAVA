package LeetCode;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
       if(nums.length == 1){
           return;
       }
       int nonZero = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] != 0){
               nums[nonZero] = nums[i];
               nonZero++;
           }
       }

       while(nonZero < nums.length){
           nums[nonZero] = 0;
           nonZero++;
       }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

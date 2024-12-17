package LeetCode;

import java.util.Arrays;

public class SuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int newArr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0) {
                newArr[i] = nums[i];
            }else{
                newArr[i] = n+i >= nums.length ? nums[i]: nums[i+n];
                if(i+1 >= newArr.length){
                    break;
                }
                newArr[i+1] = nums[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }
}

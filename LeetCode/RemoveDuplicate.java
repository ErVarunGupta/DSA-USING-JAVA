package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static ArrayList<Integer> removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i+1 < nums.length){
            if(nums[i] != nums[i+1]){
                list.add(nums[i]);
            }
            i++;
        }
        list.add(nums[i]);
        return list;
    }

    public static int[] removeDuplicate1(int arr[]){
        int newArr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    newArr[i] = arr[j];
                }else{
                    newArr[i] = arr[i];
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4,4,4};
        System.out.println(Arrays.toString(removeDuplicate1(arr)));
        //System.out.println(removeDuplicates(arr));
    }
}

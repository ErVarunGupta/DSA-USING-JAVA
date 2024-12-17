package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber136 {
//    public static int singleNumber(int[] nums) {
//       int result = 0;
//       for(int i = 0; i< nums.length; i++){
//           result = result ^ nums[i];
//       }
//       return result;
//    }

    public static int[] singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
            list.add(result);
        }
        int newArr[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 2, 1, -5, 4,6};
        //System.out.println(singleNumber(arr));
        System.out.println(Arrays.toString(singleNumber(arr)));
    }
}

package LeetCode;

import java.util.Arrays;

public class Concatination {
    public static int[] getConcatenation(int[] nums) {
        int n = (nums.length)*2;
        int newArr[] = new int[n];
        for(int i = 0; i < n; i++){
            newArr[i] = nums[(i % nums.length)];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}

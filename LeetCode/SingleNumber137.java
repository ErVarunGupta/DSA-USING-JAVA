package LeetCode;

public class SingleNumber137 {
    public static int singleNumber(int[] nums) {
        int one = 0;
        int two = 0;
        for(int num : nums){
            one ^= (num & ~two);
            two ^= (num & ~one);
        }
        return one;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 2};
        System.out.println(singleNumber(arr));
    }
}

package LeetCode;

public class MissingNumber268 {
    public static int missingNumber(int nums[]){
//        int n = nums.length;
//        int sumOfNaturalNumber = n*(n+1)/2;
//        int sum = 0;
//        for(int i = 0; i < nums.length; i++){
//            sum += nums[i];
//        }
//        return Math.abs(sumOfNaturalNumber - sum);

        int n = nums.length;
        int x = nums.length;
        for(int i = 0; i < n; i++){
            x = x^i^nums[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] = {0,1};
        System.out.println(missingNumber(arr));
    }
}

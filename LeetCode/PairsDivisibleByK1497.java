package LeetCode;

public class PairsDivisibleByK1497 {
    public static boolean canArrange(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        int count = 0;
        while(start < end){
            if((arr[start] + arr[end])%k == 0){
                count++;
            }else{
                return false;
            }
            start++;
            end--;
        }
        if(count == arr.length/2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(canArrange(arr,7));
    }
}

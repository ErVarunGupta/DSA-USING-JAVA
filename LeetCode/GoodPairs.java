package LeetCode;

public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }
}

package LeetCode;

public class ArrayIsSorted {
   public static boolean sortedArray(int nums[]){
       //int count = 1;
       for(int i = 1; i < nums.length; i++){
           if(nums[0] > nums[nums.length-1]){
               if(nums[i-1] <= nums[i]){
                   //count++;
               }
               else{
//               break;
                   return false;
               }
           }
       }
//       if(count == nums.length){
//           return true;
//       }
       return true;
   }

   public static boolean sortedAndRotated(int nums[]){
       int count = 0;
       if(nums[0] < nums[nums.length-1]) {
           count++;
       }
       for (int i = 1; i < nums.length; i++) {
           if (nums[i - 1] > nums[i]) {
               count++;
           }
       }
       System.out.println(count);
       return count <= 1;
   }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(sortedAndRotated(arr));
    }
}

package Implementation;

import java.util.HashMap;

public class Subarray_Sum_Equal_K {//O(n)
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        map.put(0,1);
        for(int j = 0; j < arr.length; j++){
            sum += arr[j]; //sum[j]
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        System.out.println("Total count of sum "+k+" = "+count);
    }
}
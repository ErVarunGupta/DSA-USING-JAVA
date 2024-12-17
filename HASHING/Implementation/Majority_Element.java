package Implementation;

import java.util.HashMap;
import java.util.Set;

public class Majority_Element {
    public static void main(String[] args) {
//        int arr[] = {1,3, 2, 5,1,3,1,5,1};
        int arr[] = {1,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
//            if(hm.containsKey(num)){
//                hm.put(num, hm.get(num)+1);
//            }else{
//                hm.put(num, 1);
//            }

            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        //Set<Integer> keys = hm.keySet();
        for(Integer count : hm.keySet()){
            if(hm.get(count) > arr.length/3){
                System.out.print(count+" ");
            }
        }
    }
}

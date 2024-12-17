package ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumber {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 3, 7, 9, 10};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println(lonelyNumber(list));
    }
    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list){
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(list);
        int n = list.size();
        for(int i = 0; i < n; i++){
            if(i != 0 || (list.get(i-1) == list.get(i)-1) || list.get(i-1) == list.get(i)){
                continue;
            }

            if(i != n-1 || (list.get(i+1) == list.get(i)+1) || list.get(i+1) == list.get(i)){
                continue;
            }

            ans.add(list.get(i));
        }
        return ans;
    }
}

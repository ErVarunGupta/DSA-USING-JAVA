package ArrayList.Assignment;

import java.util.ArrayList;

public class Pair_Sum2 {
    //Find if any pair in a sorted and rotated ArrayList has a target sum.
    //list = [11,15,6,8,9,10], target = 16
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int pivot = -1;
        int n = list.size();
        for(int i = 0; i < n-1; i++){
            if(list.get(i) > list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1;
        int rp = pivot;
        while (lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }
           else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list,13));
    }
}

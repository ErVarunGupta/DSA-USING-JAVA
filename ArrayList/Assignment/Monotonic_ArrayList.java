package ArrayList.Assignment;

import java.util.ArrayList;
public class Monotonic_ArrayList {
    public static boolean isMonotonic(ArrayList<Integer> list){
        int left = 0;
        int right = list.size()-1;
        if(list.get(left) <= list.get(right)){  // increasing monotonic order
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i) > list.get(i+1)){
                    return false;
                }
            }
        }else{  // decreasing monotonic order
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i) < list.get(i+1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(2);
        list.add(4);
        System.out.println(isMonotonic(list));
    }
}

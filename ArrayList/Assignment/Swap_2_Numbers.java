package ArrayList.Assignment;

import java.util.ArrayList;
import java.util.ArrayList;
public class Swap_2_Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(10);
        list.add(7);

        int indx1 = 1, indx2 = 3;
        System.out.println("Before swapping");
        System.out.println(list);

        swap(list,indx1,indx2);

        System.out.println("After swapping");
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
}

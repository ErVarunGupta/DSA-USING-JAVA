package ArrayList;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.*;

public class Sorting_In_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(10);
        list.add(7);



//        int arr[] = {2, 6, 8, 3, 10, 7};
//        Arrays.sort(arr);  //Asceneding order
//        System.out.println(Arrays.toString(arr));

        System.out.println(list);
        Collections.sort(list); // Ascending order
        System.out.println(list);

        //Descending order
        Collections.sort(list,Collections.reverseOrder());
        // Comparator - function to define sorting logic
        System.out.println(list);
    }
}

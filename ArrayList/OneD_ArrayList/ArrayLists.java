package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<Boolean> list3 = new ArrayList<>();
//        ArrayList<Float> list4 = new ArrayList<>();

        //add element
        list.add(10);
        list.add(2);
        list.add(0);
        list.add(4);
        System.out.println(list);

        //get element
        int ans = list.get(1);
        System.out.println(ans);

        //remove element
        list.remove(2);
        System.out.println(list);

        //update or set element
        list.set(2, 10);
        System.out.println(list);

        //length or size of the list
        int size = list.size();
        System.out.println(size);

        //sorting of array
        Collections.sort(list);
        System.out.println(list);
    }
}

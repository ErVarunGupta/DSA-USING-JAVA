package ArrayList;
import java.util.ArrayList;
//Add Element - O(1)
//Get Number - O(1)
//Remove Element - O(n)
//Set Element at Index - O(n)

public class Operations_On_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9); // O(N)

        System.out.println(list);
        //Get operation
//        int element = list.get(2);
//        System.out.println(element);
//
//        //Remove Element - O(n)
//        list.remove(2);
//        System.out.println(list);
//
//        //Set Element at Index - O(n)
//        list.set(2,10);
//        System.out.println(list);
//
//        //Contains Element - O(n)
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));

        // Size Of ArrayList
        System.out.println(list.size());
//        print the arraylist
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

//        print reverse of arrayList - O(n)
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


    }
}

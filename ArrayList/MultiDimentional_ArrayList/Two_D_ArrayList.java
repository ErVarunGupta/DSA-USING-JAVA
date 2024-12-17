package ArrayList.MultiDimentional_ArrayList;

import java.util.ArrayList;

public class Two_D_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        mainList.add(list3);

        for(int i = 0; i < mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(mainList);
        printList();
    }

    public static void printList(){
        ArrayList<ArrayList<Integer>> headList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list1.add(i*1); // 1 2 3 4 5
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }

        headList.add(list1);
        headList.add(list2);
        headList.add(list3);
        System.out.println(headList);

        for(int i = 0; i < headList.size(); i++){
            ArrayList<Integer> currList = headList.get(i);
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}

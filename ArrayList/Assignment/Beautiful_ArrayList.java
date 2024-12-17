package ArrayList.Assignment;

import java.util.ArrayList;

public class Beautiful_ArrayList {
    public static ArrayList beautifulArrayList(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for(int i = 1; i < n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int element : list){
                if(element*2 <= n){
                    temp.add(2*element);
                }
            }

            for (int element:list) {
                if(element*2-1 <= n){
                    temp.add(2*element-1);
                }
            }
            list = temp;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(beautifulArrayList(4));
    }
}

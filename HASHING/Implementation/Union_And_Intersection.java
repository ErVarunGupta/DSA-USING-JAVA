package Implementation;

import java.util.ArrayList;
import java.util.HashSet;

public class Union_And_Intersection {

    static HashSet<Integer> set = new HashSet<>();
    static int union(int arr1[], int arr2[]){
        set.clear();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.print(set+" = ");
        return set.size();
    }

    static int intersection(int arr1[], int arr2[]){
//        HashSet<Integer> ans = new HashSet<>();
        set.clear();
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
//                ans.add(arr2[i]);
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }

//        System.out.print(ans+" = ");
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};


        System.out.println("Union : ");
        System.out.println(union(arr1, arr2));
        System.out.println("Intersection : ");
        System.out.println(" = "+intersection(arr1, arr2));
    }
}

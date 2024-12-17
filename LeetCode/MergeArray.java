package LeetCode;

import java.util.*;

public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//        while(i < m && j < n){
//            if(nums1[i] < nums2[j]){
//                list.add(nums1[i]);
//                i++;
//            }else{
//                list.add(nums2[j]);
//                j++;
//            }
//        }
//        if(i == m && j != n){
//            for(int k = j; k < n; k++){
//                list.add(nums2[k]);
//            }
//        }
//
//        if(i != m && j == n){
//            for(int k = i; k < m; k++){
//                list.add(nums1[k]);
//            }
//        }
//        System.out.println(list);


        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0; j < n; j++){
            list.add(nums2[j]);
        }
        for(int i = 0; i < m; i++){
            list.add(nums1[i]);
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3,7};
        int arr2[] = {2, 5, 6,8,9};
        merge(arr1,4,  arr2,5 );
    }
}

package DivideAndConquer.Assingnment;

import java.util.Arrays;

public class Q1_MergeSort {
    public static void main(String[] args) {
        String arr[] = {"d","a","c","b","z"};
        String ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static String[] mergeSort(String arr[]){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        String left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        String right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static String[] merge(String left[], String right[]){
        String temp[] = new String[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            int l = 0;
            int n = left[i].length();
            int m = right[j].length();
            while (l < n && l < m){
                if(left[i].charAt(l) == right[j].charAt(l)){
                    l++;
                }
                else if(left[i].charAt(l) < right[j].charAt(l)){
                    temp[k] = left[i];
                    i++;
                    k++;
                    break;
                }else{
                    temp[k] = right[j];
                    j++;
                    k++;
                    break;
                }
            }
        }
        while(i < left.length){
            temp[k++] = left[i++];
        }
        while(j < right.length){
            temp[k++] = right[j++];
        }
        return temp;
    }
}

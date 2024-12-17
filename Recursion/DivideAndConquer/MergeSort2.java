package DivideAndConquer;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int arr[] = {5,2,3,1};
        int ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int left[], int right[]){
        int temp[] = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                temp[k] = left[i];
                i++;
            }else{
                temp[k] = right[j];
                j++;
            }
            k++;
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

package DivideAndConquer.Assingnment;

import java.util.Arrays;

public class Q3_InversionCount {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        mergeSort(arr);
        System.out.println(count);
    }
    public static int count = 0;
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
                count += (left.length - i);
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
